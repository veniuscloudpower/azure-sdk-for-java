// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.NetworkManagerSecurityGroupItem;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the admin rule collection properties. */
@Fluent
public final class AdminRuleCollectionPropertiesFormat {
    /*
     * A description of the admin rule collection.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Groups for configuration
     */
    @JsonProperty(value = "appliesToGroups", required = true)
    private List<NetworkManagerSecurityGroupItem> appliesToGroups;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of AdminRuleCollectionPropertiesFormat class. */
    public AdminRuleCollectionPropertiesFormat() {
    }

    /**
     * Get the description property: A description of the admin rule collection.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of the admin rule collection.
     *
     * @param description the description value to set.
     * @return the AdminRuleCollectionPropertiesFormat object itself.
     */
    public AdminRuleCollectionPropertiesFormat withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the appliesToGroups property: Groups for configuration.
     *
     * @return the appliesToGroups value.
     */
    public List<NetworkManagerSecurityGroupItem> appliesToGroups() {
        return this.appliesToGroups;
    }

    /**
     * Set the appliesToGroups property: Groups for configuration.
     *
     * @param appliesToGroups the appliesToGroups value to set.
     * @return the AdminRuleCollectionPropertiesFormat object itself.
     */
    public AdminRuleCollectionPropertiesFormat withAppliesToGroups(
        List<NetworkManagerSecurityGroupItem> appliesToGroups) {
        this.appliesToGroups = appliesToGroups;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (appliesToGroups() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property appliesToGroups in model AdminRuleCollectionPropertiesFormat"));
        } else {
            appliesToGroups().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdminRuleCollectionPropertiesFormat.class);
}
