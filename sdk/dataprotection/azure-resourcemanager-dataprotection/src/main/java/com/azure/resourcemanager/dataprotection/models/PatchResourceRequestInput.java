// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * PatchResourceRequestInput
 *
 * <p>Patch Request content for Microsoft.DataProtection resources.
 */
@Fluent
public final class PatchResourceRequestInput {
    /*
     * DppIdentityDetails
     *
     * Input Managed Identity Details
     */
    @JsonProperty(value = "identity")
    private DppIdentityDetails identity;

    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private PatchBackupVaultInput properties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of PatchResourceRequestInput class. */
    public PatchResourceRequestInput() {
    }

    /**
     * Get the identity property: DppIdentityDetails
     *
     * <p>Input Managed Identity Details.
     *
     * @return the identity value.
     */
    public DppIdentityDetails identity() {
        return this.identity;
    }

    /**
     * Set the identity property: DppIdentityDetails
     *
     * <p>Input Managed Identity Details.
     *
     * @param identity the identity value to set.
     * @return the PatchResourceRequestInput object itself.
     */
    public PatchResourceRequestInput withIdentity(DppIdentityDetails identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: Resource properties.
     *
     * @return the properties value.
     */
    public PatchBackupVaultInput properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Resource properties.
     *
     * @param properties the properties value to set.
     * @return the PatchResourceRequestInput object itself.
     */
    public PatchResourceRequestInput withProperties(PatchBackupVaultInput properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the PatchResourceRequestInput object itself.
     */
    public PatchResourceRequestInput withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
