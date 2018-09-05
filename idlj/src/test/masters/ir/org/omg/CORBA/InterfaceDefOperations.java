package org.omg.CORBA;


/**
* org/omg/CORBA/InterfaceDefOperations.java .
* IGNORE Generated by the IDL-to-Java compiler (portable), version "3.2"
* from idlj/src/main/java/com/sun/tools/corba/ee/idl/ir.idl
* IGNORE Sunday, January 21, 2018 1:54:23 PM EST
*/

public interface InterfaceDefOperations  extends org.omg.CORBA.ContainerOperations, org.omg.CORBA.ContainedOperations, org.omg.CORBA.IDLTypeOperations
{

  // read/write interface
  org.omg.CORBA.InterfaceDef[] base_interfaces ();

  // read/write interface
  void base_interfaces (org.omg.CORBA.InterfaceDef[] newBase_interfaces);
  boolean is_abstract ();
  void is_abstract (boolean newIs_abstract);

  // read interface
  boolean is_a (String interface_id);
  org.omg.CORBA.InterfaceDefPackage.FullInterfaceDescription describe_interface ();

  // write interface
  org.omg.CORBA.AttributeDef create_attribute (String id, String name, String version, org.omg.CORBA.IDLType type, org.omg.CORBA.AttributeMode mode);
  org.omg.CORBA.OperationDef create_operation (String id, String name, String version, org.omg.CORBA.IDLType result, org.omg.CORBA.OperationMode mode, org.omg.CORBA.ParameterDescription[] params, org.omg.CORBA.ExceptionDef[] exceptions, String[] contexts);
} // interface InterfaceDefOperations
