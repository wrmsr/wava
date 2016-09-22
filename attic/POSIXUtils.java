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
package com.wrmsr.presto.launcher.util;

import jnr.constants.platform.Errno;
import jnr.posix.POSIX;
import jnr.posix.POSIXFactory;
import jnr.posix.POSIXHandler;

import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POSIXUtils
{
    private static final Logger logger = Logger.getLogger(POSIXUtils.class.getName());

    private POSIXUtils()
    {
    }

    public static final POSIXHandler DEFAULT_HANDLER = new POSIXHandler()
    {

        @Override
        public void error(Errno errno, String s)
        {
        }

        @Override
        public void unimplementedError(String s)
        {
        }

        @Override
        public void warn(POSIXHandler.WARNING_ID warning_id, String s, Object... objects)
        {
        }

        @Override
        public boolean isVerbose()
        {
            return false;
        }

        @Override
        public File getCurrentWorkingDirectory()
        {
            return new File(".");
        }

        @Override
        public String[] getEnv()
        {
            return new String[0];
        }

        @Override
        public InputStream getInputStream()
        {
            return System.in;
        }

        @Override
        public PrintStream getOutputStream()
        {
            return System.out;
        }

        @Override
        public int getPID()
        {
            return 0;
        }

        @Override
        public void error(Errno errno, String s, String s2)
        {
            logger.log(Level.SEVERE, errno + " : " + s + " : " + s2);
        }

        @Override
        public PrintStream getErrorStream()
        {
            return System.err;
        }
    };

    private static POSIX posix;

    public static synchronized POSIX getPOSIX()
    {
        if (posix == null) {
            posix = POSIXFactory.getPOSIX(DEFAULT_HANDLER, true);
        }
        return posix;
    }
}
