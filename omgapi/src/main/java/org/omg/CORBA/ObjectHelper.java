/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 1998-1999 IBM Corp. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/** 
* The Helper for <tt>Object</tt>.  For more information on 
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
*/ 
 
package org.omg.CORBA;

abstract public class ObjectHelper
{
    private static String  _id = "";

    public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.Object that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static org.omg.CORBA.Object extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
            {
                __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (TCKind.tk_objref);
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static org.omg.CORBA.Object read (org.omg.CORBA.portable.InputStream istream)
    {
        return istream.read_Object ();
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.Object value)
    {
        ostream.write_Object (value);
    }

}
