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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * <p>
 * The specified value for the schema is not valid. You can only specify a
 * scheme for load balancers in a VPC.
 * </p>
 */
public class InvalidSchemeException
        extends
        com.amazonaws.services.elasticloadbalancing.model.AmazonElasticLoadBalancingException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new InvalidSchemeException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidSchemeException(String message) {
        super(message);
    }

}
