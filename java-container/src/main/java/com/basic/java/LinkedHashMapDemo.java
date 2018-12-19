package com.basic.java;

import java.util.LinkedHashMap;

/**
 * locate com.basic.java
 * Created by mastertj on 2018/12/19.
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap1=new LinkedHashMap<>();
        linkedHashMap1.put(1,"A0");
        linkedHashMap1.put(2,"B0");
        linkedHashMap1.put(3,"C0");
        System.out.println(linkedHashMap1);
        LinkedHashMap<Integer,String> linkedHashMap2=new LinkedHashMap<>(8,0.75f,true);
        linkedHashMap2.put(1,"A0");
        linkedHashMap2.put(2,"B0");
        linkedHashMap2.put(3,"C0");
        linkedHashMap2.get(1);
        System.out.println(linkedHashMap2);
    }
}
