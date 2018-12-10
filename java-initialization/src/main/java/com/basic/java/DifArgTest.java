package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/10.
 */
public class DifArgTest {
    public static void printArray(Object...args){
        for(Object obj:args){
            System.out.print(obj + "");
        }
    }
    public static void main(String[] args) {
        DifArgTest.printArray("我","今年",24,"岁");
    }
}
