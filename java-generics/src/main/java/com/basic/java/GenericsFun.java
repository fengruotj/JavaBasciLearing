package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/17.
 */
public class GenericsFun {
    public static <T> T getObj(T a){
        return a;
    }

    public static void main(String[] args) {
        Integer obj = getObj(new Integer(2));
        System.out.println(obj);
    }
}
