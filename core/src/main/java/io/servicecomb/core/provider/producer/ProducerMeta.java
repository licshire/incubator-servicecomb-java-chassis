/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.core.provider.producer;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * @author   
 * @version  [版本号, 2017年1月2日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class ProducerMeta {
    private String schemaId;

    private Object instance;

    // 因为aop的存在，instance的class不一定等于instanceClass
    private Class<?> instanceClass;

    public ProducerMeta() {
    }

    public ProducerMeta(String schemaId, Object instance, Class<?> instanceClass) {
        this.schemaId = schemaId;
        this.instance = instance;
        this.instanceClass = instanceClass;
    }

    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public Object getInstance() {
        return instance;
    }

    public void setInstance(Object instance) {
        this.instance = instance;
    }

    public Class<?> getInstanceClass() {
        return instanceClass;
    }

    public void setInstanceClass(Class<?> instanceClass) {
        this.instanceClass = instanceClass;
    }
}