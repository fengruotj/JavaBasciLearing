package com.basic.java.classloader;

/**
 * locate com.basic.java.classloader
 * Created by MasterTj on 2018/12/12.
 * 被动引用案例1
 * 通过子类引用父类的静态字段，不会导致子类的初始化
 */
public class NotInitialization1 {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
