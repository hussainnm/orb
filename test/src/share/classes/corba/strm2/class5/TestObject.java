/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

import corba.strm2.Testable;
import java.io.*;
import java.math.*;

public class TestObject extends TestObjectSuper implements Testable
{
    private static final long serialVersionUID = 378730127323820502L;
    private transient String desc;

    private static final ObjectStreamField[] serialPersistentFields = { 
        new ObjectStreamField("data0", Integer.class),
        new ObjectStreamField("data1", Long.TYPE),
        new ObjectStreamField("data2", String.class),
        new ObjectStreamField("desc", String.class),
    };

    private transient Integer data0;
    private transient long data1;
    private transient String data2;
    private transient Long optData0;
    private transient BigInteger optData1;

    public TestObject() {
        data0 = new Integer(342141);
        data1 = 1209409213L;
        data2 = "This is a test\u98DB";

        desc = "class5";

        optData0 = new Long(23124124L);
        optData1 = new BigInteger("892748282821123", 10);
    }

    public String toString() {
        return super.toString()
            + " [TestObject desc=" + desc
            + ", data0=" + data0
            + ", data1=" + data1
            + ", data2= " + data2
            + ", optData0=" + optData0
            + ", optData1=" + optData1
            + "]";
    }

    public boolean equals(Object obj) {
        try {
            TestObject other = (TestObject)obj;
            if (other == null)
                return false;

            return data0.equals(other.data0) &&
                data1 == other.data1 &&
                data2.equals(other.data2) &&
                optData0.equals(optData0) &&
                optData1.equals(optData1) &&
                super.equals(other);
        } catch (ClassCastException cce) {
            return false;
        }
    }

    private void readObject(java.io.ObjectInputStream is)
        throws IOException, ClassNotFoundException 
    {
        System.out.println("TestObject readObject");

        ObjectInputStream.GetField fields = is.readFields();

        System.out.println("Read default fields");

        data0 = (Integer)fields.get("data0", null);
        if (data0 == null)
            throw new IOException("Missing data0 field");

        data1 = fields.get("data1", 0L);
        if (data1 == 0L)
            throw new IOException("Missing data1 field");

        data2 = (String)fields.get("data2", null);
        if (data2 == null)
            throw new IOException("Missing data2 field");

        desc = (String)fields.get("desc", null);
        if (desc == null)
            throw new IOException("Missing desc field");

        try {
            optData0 = (Long)is.readObject();
            optData1 = (BigInteger)is.readObject();
        } catch (OptionalDataException ode) {

            System.out.println("Defaulting optional data");

            optData0 = new Long(23124124L);
            optData1 = new BigInteger("892748282821123", 10);
        }
    }

    private void writeObject(java.io.ObjectOutputStream out)
        throws IOException
    {
        ObjectOutputStream.PutField fields = out.putFields();

        fields.put("data0", data0);
        fields.put("data1", new Long(data1));
        fields.put("data2", data2);
        fields.put("desc", desc);
            
        out.writeFields();        

        out.writeObject(optData0);
        out.writeObject(optData1);
    }

    public String getDescription() {
        return desc;
    }
}
