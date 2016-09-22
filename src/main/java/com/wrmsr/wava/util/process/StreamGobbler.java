/*
 * Copyright 2013 John Leacox
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package com.wrmsr.wava.util.process;

import io.airlift.log.Logger;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.util.Objects.requireNonNull;

public interface StreamGobbler
        extends Closeable
{
    void gobble();

    abstract class BaseImpl
            implements StreamGobbler
    {
        protected static final Logger logger = Logger.get(StreamGobbler.class);

        protected final InputStream inputStream;

        private final ThreadImpl thread;

        public BaseImpl(InputStream inputStream)
        {
            this.inputStream = requireNonNull(inputStream, "inputStream: null");
            this.thread = new ThreadImpl();
        }

        @Override
        public void gobble()
        {
            thread.start();
        }

        protected abstract void run()
                throws IOException;

        protected class ThreadImpl
                extends Thread
        {
            ThreadImpl()
            {
                setName("StreamGobbler");
                setDaemon(true);
            }

            @Override
            public void run()
            {
                try {
                    BaseImpl.this.run();
                }
                catch (IOException e) {
                    logger.error("Failed to gobble stream", e);
                }
            }
        }

        @Override
        public void close()
                throws IOException
        {
            thread.interrupt();
            inputStream.close();
        }
    }

    final class LineImpl
            extends BaseImpl
    {
        private final boolean log;

        public LineImpl(InputStream inputStream, boolean log)
        {
            super(inputStream);
            this.log = log;
        }

        @Override
        protected void run()
                throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while (!Thread.currentThread().isInterrupted() && (line = br.readLine()) != null) {
                if (log) {
                    logger.info(line);
                }
            }
        }
    }
}
