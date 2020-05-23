/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2008-present Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.repository.browse.internal.orient;

import org.sonatype.nexus.repository.storage.BrowseNode;

import com.orientechnologies.common.concur.ONeedRetryException;

/**
 * {@link ONeedRetryException} thrown when we want to retry upserting a {@link BrowseNode} due to a collision.
 *
 * @since 3.14
 */
public class BrowseNodeCollisionException
    extends ONeedRetryException
{
  BrowseNodeCollisionException(final String message) {
    super(message);
  }
}
