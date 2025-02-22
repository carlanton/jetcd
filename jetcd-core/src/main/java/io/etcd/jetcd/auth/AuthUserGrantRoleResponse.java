/*
 * Copyright 2016-2021 The jetcd authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.etcd.jetcd.auth;

import io.etcd.jetcd.AbstractResponse;

/**
 * AuthUserGrantRoleResponse returned by
 * {@link io.etcd.jetcd.Auth#userGrantRole(io.etcd.jetcd.ByteSequence.ByteSequence,
 * io.etcd.jetcd.ByteSequence.ByteSequence)} contains a header.
 */
public class AuthUserGrantRoleResponse extends AbstractResponse<io.etcd.jetcd.api.AuthUserGrantRoleResponse> {

    public AuthUserGrantRoleResponse(io.etcd.jetcd.api.AuthUserGrantRoleResponse response) {
        super(response, response.getHeader());
    }
}
