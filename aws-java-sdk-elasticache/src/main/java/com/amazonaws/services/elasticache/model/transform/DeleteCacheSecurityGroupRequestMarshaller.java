/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * DeleteCacheSecurityGroupRequest Marshaller
 */

public class DeleteCacheSecurityGroupRequestMarshaller
        implements
        Marshaller<Request<DeleteCacheSecurityGroupRequest>, DeleteCacheSecurityGroupRequest> {

    public Request<DeleteCacheSecurityGroupRequest> marshall(
            DeleteCacheSecurityGroupRequest deleteCacheSecurityGroupRequest) {

        if (deleteCacheSecurityGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<DeleteCacheSecurityGroupRequest> request = new DefaultRequest<DeleteCacheSecurityGroupRequest>(
                deleteCacheSecurityGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "DeleteCacheSecurityGroup");
        request.addParameter("Version", "2015-02-02");
        request.setHttpMethod(HttpMethodName.POST);

        if (deleteCacheSecurityGroupRequest.getCacheSecurityGroupName() != null) {
            request.addParameter("CacheSecurityGroupName", StringUtils
                    .fromString(deleteCacheSecurityGroupRequest
                            .getCacheSecurityGroupName()));
        }

        return request;
    }

}
