package com.basic.java;

import java.util.Hashtable;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/20.
 */
public class HashTableTest {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(1,"tanjie");
        hashtable.put(2,"liuchong");
        System.out.println(hashtable);
    }
}
