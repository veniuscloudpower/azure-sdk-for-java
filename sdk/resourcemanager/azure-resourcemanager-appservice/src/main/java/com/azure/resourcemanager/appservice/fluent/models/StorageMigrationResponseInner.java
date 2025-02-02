// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response for a migration of app content request. */
@Fluent
public final class StorageMigrationResponseInner extends ProxyOnlyResource {
    /*
     * StorageMigrationResponse resource specific properties
     */
    @JsonProperty(value = "properties")
    private StorageMigrationResponseProperties innerProperties;

    /** Creates an instance of StorageMigrationResponseInner class. */
    public StorageMigrationResponseInner() {
    }

    /**
     * Get the innerProperties property: StorageMigrationResponse resource specific properties.
     *
     * @return the innerProperties value.
     */
    private StorageMigrationResponseProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public StorageMigrationResponseInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the operationId property: When server starts the migration process, it will return an operation ID
     * identifying that particular migration operation.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.innerProperties() == null ? null : this.innerProperties().operationId();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
