/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package naming.instest;

import com.sun.corba.ee.spi.misc.ORBConstants;
import corba.framework.CORBATest;
import corba.framework.Controller;
import corba.framework.Options;
import java.util.Properties;

/**
 * This is a test for INS.
 */
public class INSTest extends CORBATest
{
    public static String[] idlFiles = { "hello.idl" };

    // Define the .java files that need to be compiled.  Any
    // java files generated by compiling IDL will automatically be
    // compiled with these.
    public static String[] javaFiles = {"Client.java", 
                                        "HelloImpl.java",
                                        "INSServer.java"};

    // This is the main method defining the test.  All tests
    // should have this.

    protected void doTest() throws Throwable
    {
        Options.addIDLCompilerArgs( "-fall -oldImplBase" );
        Options.setJavaFiles(javaFiles);
        Options.setIDLFiles(idlFiles);

        compileIDLFiles();

        compileJavaFiles();

        Properties serverProps = Options.getServerProperties();
        serverProps.setProperty(ORBConstants.PERSISTENT_SERVER_PORT_PROPERTY,
                                TestConstants.PERSISTENT_PORT);

        Controller server
            = createServer("naming.instest.INSServer");

        server.start();

        Properties clientProps = Options.getClientProperties();
        clientProps.setProperty(TestConstants.URL_PROPERTY,
                                "corbaloc:iiop:1.2@localhost:"
                                + TestConstants.PERSISTENT_PORT
                                + '/'
                                + TestConstants.INSServiceName);

        Controller client = createClient("naming.instest.Client");
 
        client.start();

        client.waitFor(60000);

        // Make sure all the processes are shut down.
        client.stop();
        server.stop();
    }
}

