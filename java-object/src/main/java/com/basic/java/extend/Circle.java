package com.basic.java.extend;

/**
 * locate object
 * Created by MasterTj on 2018/12/7.
 */
public class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Circle draw");
    }

    @Override
    public void erase(){
        System.out.println("Circle erase");
    }

    @Override
    public void move(){
        System.out.println("Circle move");
    }
}
