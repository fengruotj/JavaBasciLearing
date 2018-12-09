package com.basic.java.extend;

/**
 * locate object.extend
 * Created by MasterTj on 2018/12/7.
 */
public class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Triangle draw");
    }

    @Override
    public void erase(){
        System.out.println("Triangle erase");
    }

    @Override
    public void move(){
        System.out.println("Triangle move");
    }
}
