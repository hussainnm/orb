/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package pi.serverrequestinfo;

import org.omg.PortableInterceptor.*;
import org.omg.PortableInterceptor.ORBInitInfoPackage.*;

import java.util.*;
import java.io.*;
import org.omg.CORBA.*;

import ServerRequestInfo.*; // hello interface

/**
 * Registers the necessary Server Interceptors to test 
 * ServerRequestInfo.
 */
public class TestInitializer 
    extends org.omg.CORBA.LocalObject
    implements ORBInitializer
{

    // The PrintStream to pass to the ServerRequestInfo for output.
    // This is set from the server statically.
    static PrintStream out;

    /** The ORB to pass to the ServerRequestInfo */
    static ORB orb;

    // Where to send normal requests
    static org.omg.CORBA.Object helloRef;

    // Where to forward the caller on a ForwardRequest
    static org.omg.CORBA.Object helloRefForward;
        
    /**
     * Creates a TestInitializer
     */
    public TestInitializer() {
    } 

    /**
     * Called before all references are registered
     */
    public void pre_init (org.omg.PortableInterceptor.ORBInitInfo info) {
    }

    /**
     * Called after all references are registered
     */
    public void post_init (org.omg.PortableInterceptor.ORBInitInfo info) {
        ServerRequestInterceptor interceptor1;
        ServerRequestInterceptor interceptor2;
        ServerRequestInterceptor interceptor3;

        interceptor1 = new SampleServerRequestInterceptor( "1" );
        interceptor2 = new SampleServerRequestInterceptor( "2" );
        interceptor3 = new SampleServerRequestInterceptor( "3" );

        try {
            out.println( "    - post_init: adding 3 server interceptors..." );
            info.add_server_request_interceptor( interceptor1 );
            info.add_server_request_interceptor( interceptor2 );
            info.add_server_request_interceptor( interceptor3 );
        }
        catch( DuplicateName e ) {
            out.println( "    - post_init: received DuplicateName!" );
        }

        out.println( "    - post_init: registering PolicyFactory for 100..." );
        PolicyFactory policyFactory100 = new PolicyFactoryHundred();
        info.register_policy_factory( 100, policyFactory100 );
    }

}
