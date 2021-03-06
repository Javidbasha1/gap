 cat login.java
/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.helloworld;

import java.util.logging.Logger;

/**
 * This class login.
 *
 * @since 1.0.0-SNAPSHOT
 */
public class login {
    Logger logger = Logger.getLogger(Greeter.class.getName());

    private String name;

    public login (String name) {
        this.name = name;
    }

    /**
     * This method outputs an info log saying Hello.
     */
    public void hello() {
        logger.info("Hello " + name);
    }

    /**
     * This method outputs an info log saying bye.
     */
    public void bye() {
        logger.info("Bye " + name);
    }
}
