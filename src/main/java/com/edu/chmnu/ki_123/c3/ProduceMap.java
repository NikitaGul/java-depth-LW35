package com.edu.chmnu.ki_123.c3;

import java.util.HashMap;
import java.util.Map;

public class ProduceMap {
    public static Map<String, String> createMap(String input){

        String[] pairs = input.split("[,;]+");

        Map<String, String> map = new HashMap<>();

        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();

                if (!key.isEmpty()) {
                    map.put(key, value);
                }
            }
        }
        return map;
    }

    public static void printMap(Map<String, String> map){
        System.out.println(map);
    }
}
