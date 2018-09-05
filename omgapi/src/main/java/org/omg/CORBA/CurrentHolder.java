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
* The Holder for <tt>Current</tt>.  For more information on 
* Holder files, see <a href="doc-files/generatedfiles.html#holder">
* "Generated Files: Holder Files"</a>.<P>
* org/omg/CORBA/CurrentHolder.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ../../../../../src/share/classes/org/omg/PortableServer/corba.idl
* Saturday, July 17, 1999 12:26:21 AM PDT
*/

public final class CurrentHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.Current value = null;

  public CurrentHolder ()
  {
  }

  public CurrentHolder (org.omg.CORBA.Current initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.CurrentHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.CurrentHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.CurrentHelper.type ();
  }

}
