package com.basic.java.classExecution;

/**
 * locate com.basic.java.classExecution
 * Created by MasterTj on 2018/12/14.
 * 方法动态分派演示
 */
public class DynamicDispatch {
    static abstract class Human{
        protected abstract void sayHello();
    }

    static class Man extends Human{

        @Override
        protected void sayHello() {
            System.out.println("man SayHello！！");
        }
    }

    static class Woman extends Human{

        @Override
        protected void sayHello() {
            System.out.println("Woman SayHello！！");
        }
    }

    public static void main(String[] args) {
        Human man=new Man();
        Human woman=new Woman();

        man.sayHello();;
        woman.sayHello();

        man=new Woman();
        man.sayHello();
    }
}
