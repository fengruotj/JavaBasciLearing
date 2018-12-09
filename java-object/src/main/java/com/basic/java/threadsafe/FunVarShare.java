package com.basic.java.threadsafe;

/**
 * locate object
 * Created by MasterTj on 2018/12/9.
 */
public class FunVarShare {

    public void testA(){
        int a;
        Person person=new Person();
    }
}

class Person{
    private String name;
    private int age;
}
