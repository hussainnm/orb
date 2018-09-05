/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package fake.omega;


/**
* fake/omega/KiloHelper.java
* Generated by the IBM IDL-to-Java compiler (portable), version "3.0"
* from d:/java/java/idl/omega/Kilo.idl
* 01 May 1999 14:09:34 o'clock GMT+00:00
*/

public final class KiloHelper
{
    private static String  _id = "IDL:phoney.pfix/omega/Kilo:1.0";

    public KiloHelper()
    {
    }

    public static void insert (org.omg.CORBA.Any a, fake.omega.Kilo that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    public static fake.omega.Kilo extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    private static boolean __active = false;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
            {
                synchronized (org.omg.CORBA.TypeCode.class)
                    {
                        if (__typeCode == null)
                            {
                                if (__active)
                                    {
                                        return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
                                    }
                                __active = true;
                                org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
                                org.omg.CORBA.TypeCode _tcOf_members0 = null;
                                _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
                                _members0[0] = new org.omg.CORBA.StructMember (
                                                                               "tango",
                                                                               _tcOf_members0,
                                                                               null);
                                _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
                                _members0[1] = new org.omg.CORBA.StructMember (
                                                                               "uniform",
                                                                               _tcOf_members0,
                                                                               null);
                                _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
                                _members0[2] = new org.omg.CORBA.StructMember (
                                                                               "quickstep",
                                                                               _tcOf_members0,
                                                                               null);
                                __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (fake.omega.KiloHelper.id (), "Kilo", _members0);
                                __active = false;
                            }
                    }
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    public static fake.omega.Kilo read (org.omg.CORBA.portable.InputStream istream)
    {
        fake.omega.Kilo value = new fake.omega.Kilo ();
        value.tango = istream.read_long ();
        value.uniform = istream.read_long ();
        value.quickstep = istream.read_long ();
        return value;
    }

    public static void write (org.omg.CORBA.portable.OutputStream ostream, fake.omega.Kilo value)
    {
        ostream.write_long (value.tango);
        ostream.write_long (value.uniform);
        ostream.write_long (value.quickstep);
    }

}
