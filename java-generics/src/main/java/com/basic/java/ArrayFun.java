package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/17.
 */
public class ArrayFun {
    public static void main(String[] args) {
        //数组定义的实际类型是Apple，fruit[count++]=new Orange();
        // 编译器可以编译。但是运行时发现实际类型是Apple发生运行时异常
        int count=0;
        Fruit fruit[]=new Apple[20];
        fruit[count++]=new Apple();
        fruit[count++]=new Orange();
        fruit[count++]=new Fruit();
    }
}
