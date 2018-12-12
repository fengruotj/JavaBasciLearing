package com.basic.java.classloader;

/**
 * locate com.basic.java.classloader
 * Created by MasterTj on 2018/12/12.
 * 被动引用案例2
 * 通过数组定义引用类，不会触发此类的初始化
 */
public class NotInitialization2 {
    public static void main(String[] args) {
        SuperClass[] sca=new SuperClass[20];
    }
}
