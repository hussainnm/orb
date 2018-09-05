/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

//
// Created       : 2003 Apr 10 (Thu) 11:30:38 by Harold Carr.
// Last Modified : 2003 Apr 18 (Fri) 15:05:33 by Harold Carr.
//

package corba.islocal;

import java.rmi.Remote; 
import java.rmi.RemoteException; 

public interface rmiiI
    extends 
        Remote 
{ 
    String m(String x)
        throws
            RemoteException; 
}

// End of file.

