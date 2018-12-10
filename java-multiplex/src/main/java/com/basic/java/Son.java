package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/10.
 */
class Father{
    public String Name;
    public int age;
    private double money;
    public void doPrint(){
        System.out.println("Hello World");
    }
}
public class Son extends Father {
    public static void main(String[] args) {
        Son son = new Son();
        son.Name = "Zhang San";
        son.doPrint();
        //money是父类私有的域，所以子类不能进行访问
        //son.money = 2014;
    }
}
