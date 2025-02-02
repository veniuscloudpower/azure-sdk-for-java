// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.AuthenticationType;
import com.azure.resourcemanager.iothub.models.ImportDevicesRequest;
import com.azure.resourcemanager.iothub.models.ManagedIdentity;
import org.junit.jupiter.api.Assertions;

public final class ImportDevicesRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImportDevicesRequest model =
            BinaryData
                .fromString(
                    "{\"inputBlobContainerUri\":\"fcnihgwq\",\"outputBlobContainerUri\":\"pnedgf\",\"inputBlobName\":\"vkcvqvpkeqd\",\"outputBlobName\":\"drhvoodsotbo\",\"authenticationType\":\"identityBased\",\"identity\":{\"userAssignedIdentity\":\"cjwvn\"},\"includeConfigurations\":false,\"configurationsBlobName\":\"wmgxcxrsl\"}")
                .toObject(ImportDevicesRequest.class);
        Assertions.assertEquals("fcnihgwq", model.inputBlobContainerUri());
        Assertions.assertEquals("pnedgf", model.outputBlobContainerUri());
        Assertions.assertEquals("vkcvqvpkeqd", model.inputBlobName());
        Assertions.assertEquals("drhvoodsotbo", model.outputBlobName());
        Assertions.assertEquals(AuthenticationType.IDENTITY_BASED, model.authenticationType());
        Assertions.assertEquals("cjwvn", model.identity().userAssignedIdentity());
        Assertions.assertEquals(false, model.includeConfigurations());
        Assertions.assertEquals("wmgxcxrsl", model.configurationsBlobName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImportDevicesRequest model =
            new ImportDevicesRequest()
                .withInputBlobContainerUri("fcnihgwq")
                .withOutputBlobContainerUri("pnedgf")
                .withInputBlobName("vkcvqvpkeqd")
                .withOutputBlobName("drhvoodsotbo")
                .withAuthenticationType(AuthenticationType.IDENTITY_BASED)
                .withIdentity(new ManagedIdentity().withUserAssignedIdentity("cjwvn"))
                .withIncludeConfigurations(false)
                .withConfigurationsBlobName("wmgxcxrsl");
        model = BinaryData.fromObject(model).toObject(ImportDevicesRequest.class);
        Assertions.assertEquals("fcnihgwq", model.inputBlobContainerUri());
        Assertions.assertEquals("pnedgf", model.outputBlobContainerUri());
        Assertions.assertEquals("vkcvqvpkeqd", model.inputBlobName());
        Assertions.assertEquals("drhvoodsotbo", model.outputBlobName());
        Assertions.assertEquals(AuthenticationType.IDENTITY_BASED, model.authenticationType());
        Assertions.assertEquals("cjwvn", model.identity().userAssignedIdentity());
        Assertions.assertEquals(false, model.includeConfigurations());
        Assertions.assertEquals("wmgxcxrsl", model.configurationsBlobName());
    }
}
