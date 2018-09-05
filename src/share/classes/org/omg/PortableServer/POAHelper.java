/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.omg.PortableServer;

/**
* org/omg/PortableServer/POAHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../../../../src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, October 23, 2001 1:16:58 PM PDT
*/


/**
 * A POA object manages the implementation of a
 * collection of objects. The POA supports a name space
 * for the objects, which are identified by Object Ids.
 * A POA also provides a name space for POAs. A POA is
 * created as a child of an existing POA, which forms a
 * hierarchy starting with the root POA. A POA object
 * must not be exported to other processes, or
 * externalized with ORB::object_to_string.
 */
abstract public class POAHelper
{
    private static String  _id = "IDL:omg.org/PortableServer/POA:2.3";

    public static void insert (org.omg.CORBA.Any a, 
        org.omg.PortableServer.POA that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static org.omg.PortableServer.POA extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
        {
            __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.omg.PortableServer.POAHelper.id (), "POA");
        }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static org.omg.PortableServer.POA read (
        org.omg.CORBA.portable.InputStream istream)
    {
        throw new org.omg.CORBA.MARSHAL ();
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, 
       org.omg.PortableServer.POA value)
    {
        throw new org.omg.CORBA.MARSHAL ();
    }

    public static org.omg.PortableServer.POA narrow (org.omg.CORBA.Object obj)
    {
       if (obj == null)
           return null;
       else if (obj instanceof org.omg.PortableServer.POA)
           return (org.omg.PortableServer.POA)obj;
       else if (!obj._is_a (id ()))
          throw new org.omg.CORBA.BAD_PARAM ();
       return null;
    }
}

