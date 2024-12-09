package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProduceMapTest {

    @Test
    void testCreateMap() {

        String input = "key1=value1, key2 = value2; ; key3=value3, key4 = value4";

        Map<String, String> resultMap = ProduceMap.createMap(input);

        Map<String, String> expectedMap = Map.of(
                "key1", "value1",
                "key2", "value2",
                "key3", "value3",
                "key4", "value4"
        );

        assertEquals(expectedMap, resultMap);
    }

    @Test
    void testCreateMapWithEmptyKeys() {
        String input = "=value1, key2=, key3=value3, =";

        Map<String, String> resultMap = ProduceMap.createMap(input);

        Map<String, String> expectedMap = Map.of(
                "key3", "value3"
        );

        assertEquals(expectedMap, resultMap);
    }

    @Test
    void testCreateMapWithInvalidFormat() {
        String input = "key1=value1, invalidKeyValue, key3=value3";

        Map<String, String> resultMap = ProduceMap.createMap(input);

        Map<String, String> expectedMap = Map.of(
                "key1", "value1",
                "key3", "value3"
        );

        assertEquals(expectedMap, resultMap);
    }
}