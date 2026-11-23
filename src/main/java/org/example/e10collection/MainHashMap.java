package org.example.e10collection;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Map <String,Integer> hashMap = new HashMap<>();

        hashMap.put("짜장면",5500);
        hashMap.put("짬뽕",6500);
        hashMap.put("두끼",11900);
        hashMap.put("짜장면",7000);
        hashMap.remove("두끼");

        System.out.println(hashMap.get("짜장면"));

    }
}
