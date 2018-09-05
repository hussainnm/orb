/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package corba.driinvocation;

import java.rmi.Remote ;
import java.rmi.RemoteException ;

public interface Echo extends Remote {
    void throwsSystemException() throws RemoteException ;

    void throwsUnknownException() throws RemoteException ;

    int twice( int arg ) throws RemoteException ;
}
