/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

/*
 * File: ./org/omg/CORBA/IDLType.java
 * From: ./ir.idl
 * Date: Fri Aug 28 16:03:31 1998
 *   By: idltojava Java IDL 1.2 Aug 11 1998 02:00:18
 */

package org.omg.CORBA;
/**
* tempout/org/omg/CORBA/IDLType.java
* Generated by the IBM IDL-to-Java compiler, version 1.0
* from ../../Lib/ir.idl
* Thursday, February 25, 1999 2:11:23 o'clock PM PST
*/

/**
  * An abstract interface inherited by all Interface Repository
  * (IR) objects that represent OMG IDL types. It provides access
  * to the <code>TypeCode</code> object describing the type and is used in defining the
  * other interfaces wherever definitions of <code>IDLType</code> must be referenced.
  */

public interface IDLType extends IDLTypeOperations, org.omg.CORBA.IRObject, org.omg.CORBA.portable.IDLEntity 
{
} // interface IDLType



