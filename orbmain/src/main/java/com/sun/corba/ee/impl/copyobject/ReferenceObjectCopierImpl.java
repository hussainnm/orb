/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.corba.ee.impl.copyobject ;

import org.glassfish.pfl.dynamic.copyobject.spi.ObjectCopier;


public class ReferenceObjectCopierImpl implements ObjectCopier
{
    public Object copy( Object obj, boolean debug ) {
        return obj ;
    }

    public Object copy( Object obj )
    {
        return obj ;
    }
}

