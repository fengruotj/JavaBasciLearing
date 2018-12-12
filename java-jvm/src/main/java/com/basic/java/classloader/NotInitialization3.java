package com.basic.java.classloader;

/**
 * locate com.basic.java.classloader
 * Created by MasterTj on 2018/12/12.
 * 被动引用案例3
 * 通过数组定义引用类，不会触发此类的初始化
 */
class ConstClass{
    static {
        System.out.println("ConstClass init");
    }

    public static final String HELLOWORLD="helloWorld";
}
public class NotInitialization3 {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}
