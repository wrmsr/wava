/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wrmsr.wava;

import io.airlift.airline.Arguments;
import io.airlift.airline.Cli;
import io.airlift.airline.Command;
import io.airlift.airline.Help;
import io.airlift.log.Logger;

import java.util.List;

public final class MainCli
{
    private static final Logger log = Logger.get(MainCli.class);

    public static void main(String[] args)
            throws Throwable
    {
        @SuppressWarnings({"unchecked"})
        Cli.CliBuilder<Runnable> builder = Cli.<Runnable>builder("wava")
                .withDescription("WebAssembly for Java")
                .withDefaultCommand(Help.class)
                .withCommands(
                        Help.class,
                        TranslateCommand.class);

        Cli<Runnable> parser = builder.build();
        parser.parse(args).run();
    }

    @Command(name = "translate", description = "Translates wast to java")
    public static final class TranslateCommand
            implements Runnable
    {
        @Arguments(description = "Files to be translated")
        public List<String> inputFiles;

        @Override
        public void run()
        {

        }
    }
}
