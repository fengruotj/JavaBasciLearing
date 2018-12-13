package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/13.
 */
class Father {
    int i = 10;

    public void setI(int i) {
        this.i = i;
    }
}

class Son extends Father {
    int i = 20;

    public void show() {
        System.out.println("super.i : " + super.i + ";this.i : " + this.i);
    }
}

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        Father parent = new Son();

        System.out.println(parent.i);
        System.out.println(son.i);
        System.out.println();

        son.setI(100);
        son.show();
        System.out.println(son.i);
    }
}
