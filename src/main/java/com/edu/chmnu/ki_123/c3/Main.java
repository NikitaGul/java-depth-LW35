package com.edu.chmnu.ki_123.c3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String sentence = "Nice=Cool, Color=Good; ;Make  = Do ";

        Map<String, String> map = ProduceMap.createMap(sentence);

        ProduceMap.printMap(map);
    }
}