/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.job.config;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 云作业配置对象.
 *
 * @author zhangliang
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public final class CloudJobConfiguration {
    
    private final String jobName;
    
    private final String cron;
    
    private final int shardingTotalCount;
    
    private final double cpuCount;
    
    private final double memoryMB;
    
    private final String dockerImageName;
    
    private final String appURL;
    
    private final boolean failover;
    
    private final boolean misfire;
    
    private final boolean streamingProcess;
}