package org.apache.maven.wagon.providers.ssh.knownhost;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Simple <code>KnownHostsProvider</code> with known wired values
 *
 * @author Juan F. Codagnone
 * @since Sep 12, 2005
 */
public class SingleKnownHostProvider
    extends AbstractKnownHostsProvider
{
    /**
     * Creates the SingleKnownHostProvider.
     */
    public SingleKnownHostProvider( String host, String key )
    {
        this.contents = host + " ssh-rsa " + key + "\n";
    }
}