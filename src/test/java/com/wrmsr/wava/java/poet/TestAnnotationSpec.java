/*
 * Copyright (C) 2015 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wrmsr.wava.java.poet;

import com.google.testing.compile.CompilationRule;
import org.junit.Rule;
import org.junit.Test;

import javax.lang.model.element.TypeElement;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static com.google.common.truth.Truth.assertThat;

public final class TestAnnotationSpec
{
    @Rule
    public final CompilationRule compilation = new CompilationRule();

    @Test
    public void equalsAndHashCode()
    {
        AnnotationSpec a = AnnotationSpec.builder(AnnotationC.class).build();
        AnnotationSpec b = AnnotationSpec.builder(AnnotationC.class).build();
        assertThat(a.equals(b)).isTrue();
        assertThat(a.hashCode()).isEqualTo(b.hashCode());
        a = AnnotationSpec.builder(AnnotationC.class).addMember("value", "$S", "123").build();
        b = AnnotationSpec.builder(AnnotationC.class).addMember("value", "$S", "123").build();
        assertThat(a.equals(b)).isTrue();
        assertThat(a.hashCode()).isEqualTo(b.hashCode());
    }

    @Test
    public void defaultAnnotation()
    {
        String name = IsAnnotated.class.getCanonicalName();
        TypeElement element = compilation.getElements().getTypeElement(name);
        AnnotationSpec annotation = AnnotationSpec.get(element.getAnnotationMirrors().get(0));

        TypeSpec taco = TypeSpec.classBuilder("Taco")
                .addAnnotation(annotation)
                .build();
        assertThat(toString(taco)).isEqualTo(""
                + "package com.squareup.tacos;\n"
                + "\n"
                + "import com.wrmsr.wava.java.poet.TestAnnotationSpec;\n"
                + "import java.lang.Double;\n"
                + "import java.lang.Float;\n"
                + "import java.lang.Override;\n"
                + "\n"
                + "@TestAnnotationSpec.HasDefaultsAnnotation(\n"
                + "    o = TestAnnotationSpec.Breakfast.PANCAKES,\n"
                + "    p = 1701,\n"
                + "    f = 11.1,\n"
                + "    m = {\n"
                + "        9,\n"
                + "        8,\n"
                + "        1\n"
                + "    },\n"
                + "    l = Override.class,\n"
                + "    j = @TestAnnotationSpec.AnnotationA,\n"
                + "    q = @TestAnnotationSpec.AnnotationC(\"bar\"),\n"
                + "    r = {\n"
                + "        Float.class,\n"
                + "        Double.class\n"
                + "    }\n"
                + ")\n"
                + "class Taco {\n"
                + "}\n");
    }

    @Test
    public void defaultAnnotationWithImport()
    {
        String name = IsAnnotated.class.getCanonicalName();
        TypeElement element = compilation.getElements().getTypeElement(name);
        AnnotationSpec annotation = AnnotationSpec.get(element.getAnnotationMirrors().get(0));
        TypeSpec.Builder typeBuilder = TypeSpec.classBuilder(IsAnnotated.class.getSimpleName());
        typeBuilder.addAnnotation(annotation);
        JavaFile file = JavaFile.builder("com.wrmsr.wava.java.poet", typeBuilder.build()).build();
        assertThat(file.toString()).isEqualTo(
                "package com.wrmsr.wava.java.poet;\n"
                        + "\n"
                        + "import java.lang.Double;\n"
                        + "import java.lang.Float;\n"
                        + "import java.lang.Override;\n"
                        + "\n"
                        + "@TestAnnotationSpec.HasDefaultsAnnotation(\n"
                        + "    o = TestAnnotationSpec.Breakfast.PANCAKES,\n"
                        + "    p = 1701,\n"
                        + "    f = 11.1,\n"
                        + "    m = {\n"
                        + "        9,\n"
                        + "        8,\n"
                        + "        1\n"
                        + "    },\n"
                        + "    l = Override.class,\n"
                        + "    j = @TestAnnotationSpec.AnnotationA,\n"
                        + "    q = @TestAnnotationSpec.AnnotationC(\"bar\"),\n"
                        + "    r = {\n"
                        + "        Float.class,\n"
                        + "        Double.class\n"
                        + "    }\n"
                        + ")\n"
                        + "class IsAnnotated {\n"
                        + "}\n"
        );
    }

    @Test
    public void emptyArray()
    {
        AnnotationSpec.Builder builder = AnnotationSpec.builder(HasDefaultsAnnotation.class);
        builder.addMember("n", "$L", "{}");
        assertThat(builder.build().toString()).isEqualTo(
                "@com.wrmsr.wava.java.poet.TestAnnotationSpec.HasDefaultsAnnotation(" + "n = {}" + ")");
        builder.addMember("m", "$L", "{}");
        assertThat(builder.build().toString())
                .isEqualTo(
                        "@com.wrmsr.wava.java.poet.TestAnnotationSpec.HasDefaultsAnnotation("
                                + "n = {}, m = {}"
                                + ")");
    }

    @Test
    public void dynamicArrayOfEnumConstants()
    {
        AnnotationSpec.Builder builder = AnnotationSpec.builder(HasDefaultsAnnotation.class);
        builder.addMember("n", "$T.$L", Breakfast.class, Breakfast.PANCAKES.name());
        assertThat(builder.build().toString()).isEqualTo(
                "@com.wrmsr.wava.java.poet.TestAnnotationSpec.HasDefaultsAnnotation("
                        + "n = com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.PANCAKES"
                        + ")");

        // builder = AnnotationSpec.builder(HasDefaultsAnnotation.class);
        builder.addMember("n", "$T.$L", Breakfast.class, Breakfast.WAFFLES.name());
        builder.addMember("n", "$T.$L", Breakfast.class, Breakfast.PANCAKES.name());
        assertThat(builder.build().toString()).isEqualTo(
                "@com.wrmsr.wava.java.poet.TestAnnotationSpec.HasDefaultsAnnotation("
                        + "n = {"
                        + "com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.PANCAKES"
                        + ", com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.WAFFLES"
                        + ", com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.PANCAKES"
                        + "})");

        builder = builder.build().toBuilder(); // idempotent
        assertThat(builder.build().toString()).isEqualTo(
                "@com.wrmsr.wava.java.poet.TestAnnotationSpec.HasDefaultsAnnotation("
                        + "n = {"
                        + "com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.PANCAKES"
                        + ", com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.WAFFLES"
                        + ", com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.PANCAKES"
                        + "})");

        builder.addMember("n", "$T.$L", Breakfast.class, Breakfast.WAFFLES.name());
        assertThat(builder.build().toString()).isEqualTo(
                "@com.wrmsr.wava.java.poet.TestAnnotationSpec.HasDefaultsAnnotation("
                        + "n = {"
                        + "com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.PANCAKES"
                        + ", com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.WAFFLES"
                        + ", com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.PANCAKES"
                        + ", com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.WAFFLES"
                        + "})");
    }

    @Test
    public void defaultAnnotationToBuilder()
    {
        String name = IsAnnotated.class.getCanonicalName();
        TypeElement element = compilation.getElements().getTypeElement(name);
        AnnotationSpec.Builder builder = AnnotationSpec.get(element.getAnnotationMirrors().get(0))
                .toBuilder();
        builder.addMember("m", "$L", 123);
        assertThat(builder.build().toString()).isEqualTo(
                "@com.wrmsr.wava.java.poet.TestAnnotationSpec.HasDefaultsAnnotation("
                        + "o = com.wrmsr.wava.java.poet.TestAnnotationSpec.Breakfast.PANCAKES"
                        + ", p = 1701"
                        + ", f = 11.1"
                        + ", m = {9, 8, 1, 123}"
                        + ", l = java.lang.Override.class"
                        + ", j = @com.wrmsr.wava.java.poet.TestAnnotationSpec.AnnotationA"
                        + ", q = @com.wrmsr.wava.java.poet.TestAnnotationSpec.AnnotationC(\"bar\")"
                        + ", r = {java.lang.Float.class, java.lang.Double.class}"
                        + ")");
    }

    @Test
    public void reflectAnnotation()
    {
        HasDefaultsAnnotation annotation = IsAnnotated.class.getAnnotation(HasDefaultsAnnotation.class);
        AnnotationSpec spec = AnnotationSpec.get(annotation);
        TypeSpec taco = TypeSpec.classBuilder("Taco")
                .addAnnotation(spec)
                .build();
        assertThat(toString(taco)).isEqualTo(""
                + "package com.squareup.tacos;\n"
                + "\n"
                + "import com.wrmsr.wava.java.poet.TestAnnotationSpec;\n"
                + "import java.lang.Double;\n"
                + "import java.lang.Float;\n"
                + "import java.lang.Override;\n"
                + "\n"
                + "@TestAnnotationSpec.HasDefaultsAnnotation(\n"
                + "    f = 11.1,\n"
                + "    l = Override.class,\n"
                + "    m = {\n"
                + "        9,\n"
                + "        8,\n"
                + "        1\n"
                + "    },\n"
                + "    o = TestAnnotationSpec.Breakfast.PANCAKES,\n"
                + "    p = 1701,\n"
                + "    q = @TestAnnotationSpec.AnnotationC(\"bar\"),\n"
                + "    r = {\n"
                + "        Float.class,\n"
                + "        Double.class\n"
                + "    }\n"
                + ")\n"
                + "class Taco {\n"
                + "}\n");
    }

    @Test
    public void reflectAnnotationWithDefaults()
    {
        HasDefaultsAnnotation annotation = IsAnnotated.class.getAnnotation(HasDefaultsAnnotation.class);
        AnnotationSpec spec = AnnotationSpec.get(annotation, true);
        TypeSpec taco = TypeSpec.classBuilder("Taco")
                .addAnnotation(spec)
                .build();
        assertThat(toString(taco)).isEqualTo(""
                + "package com.squareup.tacos;\n"
                + "\n"
                + "import com.wrmsr.wava.java.poet.TestAnnotationSpec;\n"
                + "import java.lang.Double;\n"
                + "import java.lang.Float;\n"
                + "import java.lang.Override;\n"
                + "\n"
                + "@TestAnnotationSpec.HasDefaultsAnnotation(\n"
                + "    a = 5,\n"
                + "    b = 6,\n"
                + "    c = 7,\n"
                + "    d = 8,\n"
                + "    e = 9.0f,\n"
                + "    f = 11.1,\n"
                + "    g = {\n"
                + "        '\\u0000',\n"
                + "        '쫾',\n"
                + "        'z',\n"
                + "        '€',\n"
                + "        'ℕ',\n"
                + "        '\"',\n"
                + "        '\\'',\n"
                + "        '\\t',\n"
                + "        '\\n'\n"
                + "    },\n"
                + "    h = true,\n"
                + "    i = TestAnnotationSpec.Breakfast.WAFFLES,\n"
                + "    j = @TestAnnotationSpec.AnnotationA,\n"
                + "    k = \"maple\",\n"
                + "    l = Override.class,\n"
                + "    m = {\n"
                + "        9,\n"
                + "        8,\n"
                + "        1\n"
                + "    },\n"
                + "    n = {\n"
                + "        TestAnnotationSpec.Breakfast.WAFFLES,\n"
                + "        TestAnnotationSpec.Breakfast.PANCAKES\n"
                + "    },\n"
                + "    o = TestAnnotationSpec.Breakfast.PANCAKES,\n"
                + "    p = 1701,\n"
                + "    q = @TestAnnotationSpec.AnnotationC(\"bar\"),\n"
                + "    r = {\n"
                + "        Float.class,\n"
                + "        Double.class\n"
                + "    }\n"
                + ")\n"
                + "class Taco {\n"
                + "}\n");
    }

    private String toString(TypeSpec typeSpec)
    {
        return JavaFile.builder("com.squareup.tacos", typeSpec).build().toString();
    }

    public enum Breakfast
    {
        WAFFLES, PANCAKES;

        public String toString() { return name() + " with cherries!"; }

        ;
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnnotationA
    {
    }

    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnnotationB
    {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnnotationC
    {
        String value();
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface HasDefaultsAnnotation
    {

        byte a() default 5;

        short b() default 6;

        int c() default 7;

        long d() default 8;

        float e() default 9.0f;

        double f() default 10.0;

        char[] g() default {0, 0xCAFE, 'z', '€', 'ℕ', '"', '\'', '\t', '\n'};

        boolean h() default true;

        Breakfast i() default Breakfast.WAFFLES;

        AnnotationA j() default @AnnotationA();

        String k() default "maple";

        Class<? extends Annotation> l() default AnnotationB.class;

        int[] m() default {1, 2, 3};

        Breakfast[] n() default {Breakfast.WAFFLES, Breakfast.PANCAKES};

        Breakfast o();

        int p();

        AnnotationC q() default @AnnotationC("foo");

        Class<? extends Number>[] r() default {Byte.class, Short.class, Integer.class, Long.class};
    }

    @HasDefaultsAnnotation(
            o = Breakfast.PANCAKES,
            p = 1701,
            f = 11.1,
            m = {9, 8, 1},
            l = Override.class,
            j = @AnnotationA,
            q = @AnnotationC("bar"),
            r = {Float.class, Double.class})
    public class IsAnnotated
    {
        // empty
    }
}
