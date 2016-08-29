import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Main {
   public static Method getMainMethod(String var0) throws ClassNotFoundException, NoSuchMethodException {
      return Class.forName(var0, false, Main.class.getClassLoader()).getMethod("main", new Class[]{String[].class});
   }

   public static boolean hasMainMethod(String var0) {
      try {
         getMainMethod(var0);
         return true;
      } catch (NoSuchMethodException var2) {
         return false;
      } catch (ClassNotFoundException var3) {
         return false;
      }
   }

   public static void usage() throws IOException {
      File var0 = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());
      JarFile var1 = new JarFile(var0);
      System.out.println("USAGE: java -jar " + var0.getName() + " cmd args...");
      System.out.println("Where cmd is one of the following:");
      Enumeration var2 = var1.entries();

      while(var2.hasMoreElements()) {
         String var3 = ((JarEntry)var2.nextElement()).getName();
         if(var3.endsWith(".class") && !var3.equals("Main.class")) {
            var3 = var3.substring(0, var3.length() - ".class".length());
            if(hasMainMethod(var3)) {
               System.out.println('\t' + var3);
            }
         }
      }

   }

   public static void main(String[] var0) {
      try {
         if(var0.length < 1) {
            usage();
         } else {
            getMainMethod(var0[0]).invoke((Object)null, new Object[]{var0});
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
