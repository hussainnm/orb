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
// Created       : 2001 May 11 (Fri) 09:28:10 by Harold Carr.
// Last Modified : 2002 May 14 (Tue) 20:29:25 by Harold Carr.
//

package corba.hcks;

public class ClientGrow
{
    public static void main (String av[])
    {
        Client.testName = ClientGrow.class.getName() ;
        Client.giopVersion = C.GIOP_VERSION_1_2;
        Client.buffMgrStategy = C.BUFFMGR_STRATEGY_GROW;
        Client.fragmentSize = -1;
        Client.main(av);
    }
}

// End of file.
