/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.omg.CORBA;


/**
* Interfaces derived from the <tt>Current</tt> interface enable ORB and CORBA
* services to provide access to information (context) associated with
* the thread of execution in which they are running. This information 
* is accessed in a structured manner using interfaces derived from the
* <tt>Current</tt> interface defined in the CORBA module.
*
* <P>Each ORB or CORBA service that needs its own context derives an
* interface from the CORBA module's <tt>Current</tt>. Users of the
* service can obtain an instance of the appropriate <tt>Current</tt>
* interface by invoking <tt>ORB::resolve_initial_references</tt>.<P>
*
* org/omg/CORBA/Current.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ../../../../../src/share/classes/org/omg/PortableServer/corba.idl
* Saturday, July 17, 1999 12:26:21 AM PDT.
*/

public interface Current extends CurrentOperations, org.omg.CORBA.Object, org.omg.CORBA.portable.IDLEntity 
{
} // interface Current
