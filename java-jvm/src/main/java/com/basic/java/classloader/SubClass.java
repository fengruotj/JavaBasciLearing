package com.basic.java.classloader;

/**
 * locate com.basic.java.classloader
 * Created by MasterTj on 2018/12/12.
 */
public  class SubClass extends SuperClass{
    static {
        System.out.println("SubClass init");
    }
}
