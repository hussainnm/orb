/*
 * Copyright (c) 2017, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.corba.ee.spi;

/**
 * Public constants for interaction with the Glassfish JNDI implementation.
 */
public interface JndiConstants {

    /** The name of the class used to create context factories for COSNaming. */
    String COSNAMING_CONTEXT_FACTORY = "com.sun.jndi.cosnaming.CNCtxFactory";

    /** The JDK's registry context factory. */
    String REGISTRY_CONTEXT_FACTORY = "com.sun.jndi.rmi.registry.RegistryContextFactory";

    /** A System Property which may be defined as equal to a trusted classpath URL. */
    String TRUST_URLCODEBASE = "com.sun.jndi.cosnaming.object.trustURLCodebase";

    /** A system property which can be set to true to enable JNDI federation */
    String ENABLE_FEDERATION = "com.sun.jndi.cosnaming.federation";
}
