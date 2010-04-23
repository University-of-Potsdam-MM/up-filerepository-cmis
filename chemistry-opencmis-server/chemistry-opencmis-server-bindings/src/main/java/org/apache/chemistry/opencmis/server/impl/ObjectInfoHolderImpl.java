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
package org.apache.chemistry.opencmis.server.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.chemistry.opencmis.commons.api.server.ObjectInfo;
import org.apache.chemistry.opencmis.server.spi.ObjectInfoHolder;

/**
 * Implementation of the {@link ObjectInfo} interface.
 */
public class ObjectInfoHolderImpl implements ObjectInfoHolder {

    private Map<String, ObjectInfo> fObjectInfoMap;

    /**
     * Constructor.
     */
    public ObjectInfoHolderImpl() {
        fObjectInfoMap = new HashMap<String, ObjectInfo>();
    }

    public void addObjectInfo(ObjectInfo info) {
        if (info == null) {
            throw new IllegalArgumentException("Object Info must not be null!");
        }
        if (info.getId() == null) {
            throw new IllegalArgumentException("Object Info Id must not be null!");
        }

        fObjectInfoMap.put(info.getId(), info);
    }

    public ObjectInfo getObjectInfo(String id) {
        return fObjectInfoMap.get(id);
    }
}