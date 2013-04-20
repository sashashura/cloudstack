/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cloudstack.engine.subsystem.api.storage;

import org.apache.cloudstack.framework.async.AsyncCallFuture;



import com.cloud.hypervisor.Hypervisor.HypervisorType;

public interface TemplateService {
    AsyncCallFuture<CommandResult> createTemplateAsync(TemplateInfo template, DataStore store);
    AsyncCallFuture<CommandResult> createTemplateFromSnapshotAsync(SnapshotInfo snapshot, TemplateInfo template, DataStore store);
    AsyncCallFuture<CommandResult> createTemplateFromVolumeAsync(VolumeInfo volume, TemplateInfo template, DataStore store);
    AsyncCallFuture<CommandResult> deleteTemplateAsync(TemplateInfo template);

    void handleSysTemplateDownload(HypervisorType hostHyper, Long dcId);
    void handleTemplateSync(DataStore store);
    void downloadBootstrapSysTemplate(DataStore store);
}
