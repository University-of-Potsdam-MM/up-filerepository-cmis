/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.chemistry.opencmis.commons.impl.dataobjects;

import java.util.HashSet;
import java.util.Set;

import org.apache.chemistry.opencmis.commons.bindings.AllowableActions;
import org.apache.chemistry.opencmis.commons.enums.AllowableActionsEnum;

/**
 * @author <a href="mailto:fmueller@opentext.com">Florian M&uuml;ller</a>
 *
 */
public class AllowableActionsImpl extends AbstractExtensionData implements AllowableActions {

  private Set<AllowableActionsEnum> allowableActions = new HashSet<AllowableActionsEnum>();

  /*
   * (non-Javadoc)
   *
   * @see org.apache.opencmis.client.provider.AllowableActionsData#getAllowableActions()
   */
  public Set<AllowableActionsEnum> getAllowableActions() {
    return allowableActions;
  }

  public void setAllowableActions(Set<AllowableActionsEnum> allowableActions) {
    this.allowableActions = allowableActions;
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Allowable Actions [allowable actions=" + allowableActions + "]" + super.toString();
  }
}