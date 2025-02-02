// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.fluent.models.EmailServiceResourceInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class EmailServiceResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EmailServiceResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Creating\",\"dataLocation\":\"dehxnltyfsoppu\"},\"location\":\"esnzwde\",\"tags\":{\"qvudwxdndnvowgu\":\"vorxzdmohct\"},\"id\":\"jugwdkcglhsl\",\"name\":\"zj\",\"type\":\"yggdtjixh\"}")
                .toObject(EmailServiceResourceInner.class);
        Assertions.assertEquals("esnzwde", model.location());
        Assertions.assertEquals("vorxzdmohct", model.tags().get("qvudwxdndnvowgu"));
        Assertions.assertEquals("dehxnltyfsoppu", model.dataLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EmailServiceResourceInner model =
            new EmailServiceResourceInner()
                .withLocation("esnzwde")
                .withTags(mapOf("qvudwxdndnvowgu", "vorxzdmohct"))
                .withDataLocation("dehxnltyfsoppu");
        model = BinaryData.fromObject(model).toObject(EmailServiceResourceInner.class);
        Assertions.assertEquals("esnzwde", model.location());
        Assertions.assertEquals("vorxzdmohct", model.tags().get("qvudwxdndnvowgu"));
        Assertions.assertEquals("dehxnltyfsoppu", model.dataLocation());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
