// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.AzureResourceSkuInner;
import com.azure.resourcemanager.kusto.models.AzureCapacity;
import com.azure.resourcemanager.kusto.models.AzureScaleType;
import com.azure.resourcemanager.kusto.models.AzureSku;
import com.azure.resourcemanager.kusto.models.AzureSkuName;
import com.azure.resourcemanager.kusto.models.AzureSkuTier;
import com.azure.resourcemanager.kusto.models.ListResourceSkusResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ListResourceSkusResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ListResourceSkusResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"resourceType\":\"lmuzy\",\"sku\":{\"name\":\"Standard_E16as_v5+4TB_PS\",\"capacity\":699182053,\"tier\":\"Standard\"},\"capacity\":{\"scaleType\":\"none\",\"minimum\":1101011494,\"maximum\":2111181142,\"default\":104874824}}]}")
                .toObject(ListResourceSkusResult.class);
        Assertions.assertEquals("lmuzy", model.value().get(0).resourceType());
        Assertions.assertEquals(AzureSkuName.STANDARD_E16AS_V5_4TB_PS, model.value().get(0).sku().name());
        Assertions.assertEquals(699182053, model.value().get(0).sku().capacity());
        Assertions.assertEquals(AzureSkuTier.STANDARD, model.value().get(0).sku().tier());
        Assertions.assertEquals(AzureScaleType.NONE, model.value().get(0).capacity().scaleType());
        Assertions.assertEquals(1101011494, model.value().get(0).capacity().minimum());
        Assertions.assertEquals(2111181142, model.value().get(0).capacity().maximum());
        Assertions.assertEquals(104874824, model.value().get(0).capacity().defaultProperty());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ListResourceSkusResult model =
            new ListResourceSkusResult()
                .withValue(
                    Arrays
                        .asList(
                            new AzureResourceSkuInner()
                                .withResourceType("lmuzy")
                                .withSku(
                                    new AzureSku()
                                        .withName(AzureSkuName.STANDARD_E16AS_V5_4TB_PS)
                                        .withCapacity(699182053)
                                        .withTier(AzureSkuTier.STANDARD))
                                .withCapacity(
                                    new AzureCapacity()
                                        .withScaleType(AzureScaleType.NONE)
                                        .withMinimum(1101011494)
                                        .withMaximum(2111181142)
                                        .withDefaultProperty(104874824))));
        model = BinaryData.fromObject(model).toObject(ListResourceSkusResult.class);
        Assertions.assertEquals("lmuzy", model.value().get(0).resourceType());
        Assertions.assertEquals(AzureSkuName.STANDARD_E16AS_V5_4TB_PS, model.value().get(0).sku().name());
        Assertions.assertEquals(699182053, model.value().get(0).sku().capacity());
        Assertions.assertEquals(AzureSkuTier.STANDARD, model.value().get(0).sku().tier());
        Assertions.assertEquals(AzureScaleType.NONE, model.value().get(0).capacity().scaleType());
        Assertions.assertEquals(1101011494, model.value().get(0).capacity().minimum());
        Assertions.assertEquals(2111181142, model.value().get(0).capacity().maximum());
        Assertions.assertEquals(104874824, model.value().get(0).capacity().defaultProperty());
    }
}
