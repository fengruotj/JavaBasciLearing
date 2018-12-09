package com.basic.java.extend;

/**
 * locate object.extend
 * Created by MasterTj on 2018/12/7.
 */
public class Square extends Shape{
    @Override
    public void draw(){
        System.out.println("Square draw");
    }

    @Override
    public void erase(){
        System.out.println("Square erase");
    }

    @Override
    public void move(){
        System.out.println("Square move");
    }
}
