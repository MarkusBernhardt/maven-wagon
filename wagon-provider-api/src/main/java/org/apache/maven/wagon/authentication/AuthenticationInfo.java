package org.apache.maven.wagon.authentication;

/* ====================================================================
 *   Copyright 2001-2004 The Apache Software Foundation.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * ====================================================================
 */

import java.io.Serializable;

/**
 * This class holds the set of properties used when instance of the <code>Wagon</code>
 * will use during login opreration.
 *
 * @todo group, mode and directory mode do not belong here - they are repository info.
 *
 * @author <a href="michal.maczka@dimatics.com">Michal Maczka</a>
 * @version $Id$
 *
 * @todo michal: I added fileMode,directoryMode as it was uses in test classes. I am not sure why we need them.
 */
public class AuthenticationInfo implements Serializable
{

    /** Username used to login to the host */
    private String userName;

    /** Password associated with the login */
    private String password;

    /** Repository group name. */
    private String group;

    /** Repository directory mode. Modes can be in either textual (ugo+rx) or octal (755) form. */
    private String directoryMode;

    /** Repository file mode. Modes can be in either textual (ugo+rx) or octal (644) form. */
    private String fileMode;

    /** Passphrase of the user's private key file */
    private String passphrase;

    /** The absolute path to private key file */
    private String privateKey;

    /**
     * Get the passphrase of the private key file. The passphrase is used only
     * when host/protocol supports authentication via exchange of
     * private/public keys and private key was used for authentication.
     * 
     * @return passphrase of the private key file
     */
    public String getPassphrase()
    {
        return passphrase;
    }

    /**
     * Set the passphrase of the private key file.
     * 
     * @param passphrase passphrase of the private key file
     */
    public void setPassphrase( final String passphrase )
    {
        this.passphrase = passphrase;
    }

    /**
     * Get the absolute path to the private key file.
     * 
     * @return absolute path to private key
     */
    public String getPrivateKey()
    {
        return privateKey;
    }

    /**
     * Set the absolute path to private key file.
     * 
     * @param privateKey path to private key in local file system
     */
    public void setPrivateKey( final String privateKey )
    {
        this.privateKey = privateKey;
    }

    /**
     * Get the repository group name to which an artifact will belong to after
     * deployemnt. Not all protolcols permit the changing of the artifact
     * group.
     * 
     * @return repository group name
     */
    public String getGroup()
    {
        return group;
    }

    /**
     * Set the repository group name for the deployed artifact.
     * 
     * @param group repository group for deployed artifacts
     */
    public void setGroup( final String group )
    {
        this.group = group;
    }

    /**
     * Get the repository directory mode to which an artifact will belong to after
     * deployment. Not all protolcols permit the changing of the mode.
     * 
     * @return mode
     */
    public String getDirectoryMode()
    {
        return directoryMode;
    }

    /**
     * Set the repository directory mode for the deployed artifact.
     * 
     * @param directoryMode repository directory mode for deployed artifacts
     */
    public void setDirectoryMode( final String directoryMode )
    {
        this.directoryMode = directoryMode;
    }

    /**
     * Get the repository file mode to which an artifact will belong to after
     * deployment. Not all protolcols permit the changing of the artifact mode.
     * 
     * @return repository group name
     */
    public String getFileMode()
    {
        return fileMode;
    }

    /**
     * Set the repository file mode for the deployed artifact.
     * 
     * @param fileMode repository file mode for deployed artifacts
     */
    public void setFileMode( final String fileMode )
    {
        this.fileMode = fileMode;
    }

    /**
     * Get the user's password which is used when connecting to the repository.
     * 
     * @return password of user
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Set the user's password which is used when connecting to the repository.
     * 
     * @param password password of the user
     */
    public void setPassword( final String password )
    {
        this.password = password;
    }

    /**
     * Get the username used to access the repository.
     * 
     * @return username at repository
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * Set username used to access the repository.
     * 
     * @param userName the username used to access repository
     */
    public void setUserName( final String userName )
    {
        this.userName = userName;
    }
}