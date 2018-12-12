package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/12.
 */
public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}
