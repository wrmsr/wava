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
package com.wrmsr.wava.clang;

import com.google.common.base.MoreObjects;

import java.util.Optional;

public class CxException
        extends Exception
{
    private final Optional<CxError> error;

    public CxException(CxError error, String message, Throwable cause)
    {
        super(message, cause);
        this.error = Optional.of(error);
    }

    public CxException(String message, Throwable cause)
    {
        super(message, cause);
        this.error = Optional.empty();
    }

    public CxException(CxError error, String message)
    {
        super(message, null);
        this.error = Optional.of(error);
    }

    public CxException(CxError error)
    {
        super(null, null);
        this.error = Optional.of(error);
    }

    public CxException()
    {
        super(null, null);
        this.error = Optional.empty();
    }

    public Optional<CxError> getError()
    {
        return error;
    }

    @Override
    public String toString()
    {
        return MoreObjects.toStringHelper(this)
                .add("message", getMessage())
                .add("cause", getCause())
                .add("error", error)
                .toString();
    }
}
