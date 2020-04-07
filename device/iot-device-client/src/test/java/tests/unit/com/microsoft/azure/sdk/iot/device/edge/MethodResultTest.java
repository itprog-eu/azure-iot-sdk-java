/*
 *  Copyright (c) Microsoft. All rights reserved.
 *  Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package tests.unit.com.microsoft.azure.sdk.iot.device.edge;

import com.microsoft.azure.sdk.iot.device.edge.MethodResult;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import com.microsoft.azure.sdk.iot.testcategories.UnitTestCategory;
import com.microsoft.azure.sdk.iot.testcategories.IoTHubTestCategory;

import static junit.framework.TestCase.assertEquals;

@Category({UnitTestCategory.class, IoTHubTestCategory.class})
public class MethodResultTest
{
    // Tests_SRS_DIRECTMETHODRESULT_34_001: [This function shall return the saved status.]
    // Tests_SRS_DIRECTMETHODRESULT_34_002: [This function shall return the saved status.]
    // Tests_SRS_DIRECTMETHODRESULT_34_003: [This constructor shall retrieve the payload and status from the provided json.]
    @Test
    public void constructorParsesJsonAndGettersWork()
    {
        //arrange
        String json = "{\n" + "  \"status\": \"2\",\n" + "  \"payload\": \"somePayload\"\n" + "}";

        //act
        MethodResult result = new MethodResult(json);

        //assert
        assertEquals("somePayload", result.getPayload());
        assertEquals(2, result.getStatus());
    }
}
