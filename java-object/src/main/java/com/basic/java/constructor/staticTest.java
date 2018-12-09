package com.basic.java.constructor;

/**
 * locate object
 * Created by MasterTj on 2018/12/8.
 */
public class staticTest {

    public static void main(String[] args) {
        new MyClass();
    }
}

class SuperClass{
    //父类静态构造代码块
    static{
        System.out.println("superClass static block");
    }

    //父类静态变量
    private static SuperStaticVariable staticVariable=new SuperStaticVariable();

    //父类实列变量
    private SuperVariable variable=new SuperVariable();

    //父类构造代码块
    {
        System.out.println("superClass block");
    }

    //父类构造函数
    public SuperClass() {
        System.out.println("SuperClass constructor");
    }
}

class SuperStaticVariable{
    public SuperStaticVariable() {
        System.out.println("SuperStaticVariable init");
    }
}

class SuperVariable{
    public SuperVariable() {
        System.out.println("SuperVariable init");
    }
}

class MyClass extends SuperClass {
    //子类静态变量
    static{
        System.out.println("myclass static");
    }

    //子类静态变量
    private static MyClassStaticVariable staticVariable = new MyClassStaticVariable();

    //子类实列变量
    private MyClassVariable variable = new MyClassVariable();

    //子类构造代码块
    {
        System.out.println("myclass block");
    }

    //子类构造函数
    public MyClass() {
        System.out.println("myclass constructor");
    }
}

class MyClassStaticVariable{
    public MyClassStaticVariable() {
        System.out.println("MyClassStaticVariable init");
    }
}

class MyClassVariable{
    public MyClassVariable() {
        System.out.println("MyClassVariable init");
    }
}

