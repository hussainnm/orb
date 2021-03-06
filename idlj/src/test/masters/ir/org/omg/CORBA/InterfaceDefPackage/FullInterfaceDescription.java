package org.omg.CORBA.InterfaceDefPackage;


/**
* org/omg/CORBA/InterfaceDefPackage/FullInterfaceDescription.java .
* IGNORE Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlj/src/main/java/com/sun/tools/corba/ee/idl/ir.idl
* IGNORE Sunday, January 21, 2018 1:54:23 PM EST
*/

public final class FullInterfaceDescription implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String id = null;
  public String defined_in = null;
  public String version = null;
  public boolean is_abstract = false;
  public org.omg.CORBA.OperationDescription operations[] = null;
  public org.omg.CORBA.AttributeDescription attributes[] = null;
  public String base_interfaces[] = null;
  public org.omg.CORBA.TypeCode type = null;

  public FullInterfaceDescription ()
  {
  } // ctor

  public FullInterfaceDescription (String _name, String _id, String _defined_in, String _version, boolean _is_abstract, org.omg.CORBA.OperationDescription[] _operations, org.omg.CORBA.AttributeDescription[] _attributes, String[] _base_interfaces, org.omg.CORBA.TypeCode _type)
  {
    name = _name;
    id = _id;
    defined_in = _defined_in;
    version = _version;
    is_abstract = _is_abstract;
    operations = _operations;
    attributes = _attributes;
    base_interfaces = _base_interfaces;
    type = _type;
  } // ctor

} // class FullInterfaceDescription
