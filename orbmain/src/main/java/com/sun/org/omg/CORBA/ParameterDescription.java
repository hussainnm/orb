/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.org.omg.CORBA;


/**
* com/sun/org/omg/CORBA/ParameterDescription.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* Thursday, May 6, 1999 1:51:50 AM PDT
*/

// This file has been _CHANGED_

public final class ParameterDescription implements org.omg.CORBA.portable.IDLEntity
{
    public String name = null;
    public org.omg.CORBA.TypeCode type = null;
    // _CHANGED_
    //public com.sun.org.omg.CORBA.IDLType type_def = null;
    public org.omg.CORBA.IDLType type_def = null;
    public com.sun.org.omg.CORBA.ParameterMode mode = null;

    public ParameterDescription ()
    {
    } // ctor

    // _CHANGED_
    //public ParameterDescription (String _name, org.omg.CORBA.TypeCode _type, com.sun.org.omg.CORBA.IDLType _type_def, com.sun.org.omg.CORBA.ParameterMode _mode)
    public ParameterDescription (String _name, org.omg.CORBA.TypeCode _type, org.omg.CORBA.IDLType _type_def, com.sun.org.omg.CORBA.ParameterMode _mode)
    {
        name = _name;
        type = _type;
        type_def = _type_def;
        mode = _mode;
    } // ctor

} // class ParameterDescription
