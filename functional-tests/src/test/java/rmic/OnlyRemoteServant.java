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

package rmic;
import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.rmi.PortableRemoteObject;

public class OnlyRemoteServant extends PortableRemoteObject
    implements Remote {
    public OnlyRemoteServant () throws RemoteException {
    }

    public String message (){
        return "Hello World!";
    }
}
