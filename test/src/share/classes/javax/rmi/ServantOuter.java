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

package javax.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServantOuter extends Remote {
    public ServantOuter echo (ServantOuter in) throws RemoteException;
    
    public class Inner implements ServantOuter {
        public Inner () throws RemoteException {}
        public ServantOuter echo (ServantOuter in) throws RemoteException {return in;}
    }
}
