/*
 *  Copyright (c) 2011-2015 The original author or authors
 *  ------------------------------------------------------
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *       The Eclipse Public License is available at
 *       http://www.eclipse.org/legal/epl-v10.html
 *
 *       The Apache License v2.0 is available at
 *       http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

package io.vertx.stomp.tests.impl;

import io.vertx.ext.stomp.Destination;

import java.util.List;

/**
 * Some helper methods.
 *
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public class Helper {
  public static boolean hasDestination(List<Destination> destinations, String dest) {
    for (Destination d : destinations) {
      if (d.matches(dest)) {
        return true;
      }
    }
    return false;
  }
}
