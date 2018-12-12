package com.basic.java.test;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/12.
 */
public class DoThis {
    void f(){
        System.out.println("This is outClass's method");
    }
    private class Inner{
        public DoThis outer(){
            return DoThis.this;
            //return this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        Inner in = dt.inner();
        in.outer().f();

        Inner out=dt.new Inner();
        out.outer().f();
    }
}
