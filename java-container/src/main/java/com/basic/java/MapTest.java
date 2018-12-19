package com.basic.java;

import java.util.*;

/**
 * locate com.basic.java
 * Created by mastertj on 2018/12/19.
 */
public class MapTest {
    public static void main(String[] args) {
        SortedMap<String,String> map=new TreeMap<>();
        map.put("tanjie","boy");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            System.out.println(stringStringEntry);
        }
        Comparator<? super String> comparator = map.comparator();
        System.out.println(comparator);

        Map<String,String> hashmap=new HashMap<>();
        hashmap.put("tanjie","boy");
        System.out.println(hashmap);

        Map<String, String> kvMap = Collections.checkedMap(hashmap, String.class, String.class);
        System.out.println(kvMap);
        AbstractMap<String,String> abstractMap=new HashMap<>();
        abstractMap.put("tanjie","boy");
        System.out.println(abstractMap);
    }
}
