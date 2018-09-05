/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package pi.policyfactory;

import test.Test;
import corba.framework.*;
import java.util.*;

/**
 * This is a test for module dynamic, which is part of Portable Interceptors/
 */
public class PolicyFactoryTest extends CORBATest
{

    // Define the .java files that need to be compiled.  Any
    // java files generated by compiling IDL will automatically be
    // compiled with these.
    public static String[] javaFiles = {"Client.java",
                                        "TestORBInitializer.java" };
                                        

    // This is the main method defining the test.  All tests
    // should have this.
    protected void doTest() throws Throwable
    {
        Options.setJavaFiles(javaFiles);

        compileJavaFiles();

        Controller client = createClient("pi.policyfactory.Client");


        client.start();

        // Wait for the client to finish for up to 2 minutes, then
        // throw an exception.
        client.waitFor(120000);

        // Make sure all the processes are shut down.
        client.stop();

    }
}

