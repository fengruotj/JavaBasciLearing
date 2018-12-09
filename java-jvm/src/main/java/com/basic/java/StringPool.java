package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/9.
 * Java运行时常量池（StringPool String池）
 */
public class StringPool {
    public static void main(String[] args) {
        String str1 = "droid";//StringPool 中创建一个对象 "droid"
        String str2 = "droid";//StringPool 已经含有"droid"字面量,直接引用
        String str3 = new String("droid");//在Java Heap中创建一个对象，对象值为字面量"droid"
        String str4 = new String("droid");//在Java Heap中创建一个对象，对象值为字面量"droid"
        System.out.println(str1==str2);
        System.out.println(str3==str4);
    }
}
