package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/11.
 */
public class Bicyle extends Cycle {
    public void run() {
        System.out.println("Bicyle run");
    }

    @Override
    public void staticRun() {
        System.out.println("Bicyle staticRun");
    }
}
