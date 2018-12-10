package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/10.
 */
public class ConstructorTest {
    private int age;
    private String name;
    ConstructorTest(){

    }
    ConstructorTest(int i){
        age=i;
    }
    ConstructorTest(String j){
        name=j;
    }
    ConstructorTest(int i,String j){
        age=i;
        name=j;
    }
    public static void main(String[] args) {
        ConstructorTest ct1 = new ConstructorTest();
        ConstructorTest ct2 = new ConstructorTest(22);
        ConstructorTest ct3 = new ConstructorTest("张三");
        ConstructorTest ct4 = new ConstructorTest(23,"李四");
        System.out.println("ct1 age=" + ct1.age + "---name=" + ct1.name);
        System.out.println("ct2 age=" + ct2.age + "---name=" + ct2.name);
        System.out.println("ct3 age=" + ct3.age + "---name=" + ct3.name);
        System.out.println("ct4 age=" + ct4.age + "---name=" + ct4.name);
    }
}
