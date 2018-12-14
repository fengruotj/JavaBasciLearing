package com.basic.java.classExecution;

/**
 * locate com.basic.java.classExecution
 * Created by MasterTj on 2018/12/14.
 */
class Human {
}

class Man extends Human {
}

class Woman extends Human {
}

public class StaticDispatch {

    public void sayHello(Human guy) {
        System.out.println("hello, guy!");
    }

    public void sayHello(Man guy){
        System.out.println("hello, gentleman!");
    }

    public void sayHello(Woman guy){
        System.out.println("hello, lady!");
    }

    public static void main(String[] args){
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);
        sr.sayHello(woman);
    }
}
