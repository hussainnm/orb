package org.omg.CORBA;

/**
* org/omg/CORBA/ConstantDescriptionHolder.java .
* IGNORE Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlj/src/main/java/com/sun/tools/corba/ee/idl/ir.idl
* IGNORE Sunday, January 21, 2018 1:54:23 PM EST
*/

public final class ConstantDescriptionHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.ConstantDescription value = null;

  public ConstantDescriptionHolder ()
  {
  }

  public ConstantDescriptionHolder (org.omg.CORBA.ConstantDescription initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.ConstantDescriptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.ConstantDescriptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.ConstantDescriptionHelper.type ();
  }

}
