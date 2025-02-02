// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.OperationJobExtendedInfoInner;
import org.junit.jupiter.api.Assertions;

public final class OperationJobExtendedInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationJobExtendedInfoInner model =
            BinaryData
                .fromString("{\"objectType\":\"OperationJobExtendedInfo\",\"jobId\":\"yb\"}")
                .toObject(OperationJobExtendedInfoInner.class);
        Assertions.assertEquals("yb", model.jobId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationJobExtendedInfoInner model = new OperationJobExtendedInfoInner().withJobId("yb");
        model = BinaryData.fromObject(model).toObject(OperationJobExtendedInfoInner.class);
        Assertions.assertEquals("yb", model.jobId());
    }
}
