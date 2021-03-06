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
package com.amazonaws.services.snowball;

import com.amazonaws.services.snowball.model.*;

/**
 * Abstract implementation of {@code AmazonSnowballAsync}. Convenient method
 * forms pass through to the corresponding overload that takes a request object
 * and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonSnowballAsync extends AbstractAmazonSnowball
        implements AmazonSnowballAsync {

    protected AbstractAmazonSnowballAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(
            CancelJobRequest request) {

        return cancelJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelJobResult> cancelJobAsync(
            CancelJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelJobRequest, CancelJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAddressResult> createAddressAsync(
            CreateAddressRequest request) {

        return createAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAddressResult> createAddressAsync(
            CreateAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAddressRequest, CreateAddressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(
            CreateJobRequest request) {

        return createJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateJobResult> createJobAsync(
            CreateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateJobRequest, CreateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAddressResult> describeAddressAsync(
            DescribeAddressRequest request) {

        return describeAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAddressResult> describeAddressAsync(
            DescribeAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAddressRequest, DescribeAddressResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(
            DescribeAddressesRequest request) {

        return describeAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAddressesResult> describeAddressesAsync(
            DescribeAddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAddressesRequest, DescribeAddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(
            DescribeJobRequest request) {

        return describeJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeJobResult> describeJobAsync(
            DescribeJobRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobRequest, DescribeJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetJobManifestResult> getJobManifestAsync(
            GetJobManifestRequest request) {

        return getJobManifestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobManifestResult> getJobManifestAsync(
            GetJobManifestRequest request,
            com.amazonaws.handlers.AsyncHandler<GetJobManifestRequest, GetJobManifestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetJobUnlockCodeResult> getJobUnlockCodeAsync(
            GetJobUnlockCodeRequest request) {

        return getJobUnlockCodeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetJobUnlockCodeResult> getJobUnlockCodeAsync(
            GetJobUnlockCodeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetJobUnlockCodeRequest, GetJobUnlockCodeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSnowballUsageResult> getSnowballUsageAsync(
            GetSnowballUsageRequest request) {

        return getSnowballUsageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSnowballUsageResult> getSnowballUsageAsync(
            GetSnowballUsageRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSnowballUsageRequest, GetSnowballUsageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            ListJobsRequest request) {

        return listJobsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListJobsResult> listJobsAsync(
            ListJobsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListJobsRequest, ListJobsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(
            UpdateJobRequest request) {

        return updateJobAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateJobResult> updateJobAsync(
            UpdateJobRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateJobRequest, UpdateJobResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
