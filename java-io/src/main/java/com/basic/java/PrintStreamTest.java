package com.basic.java;

import java.io.PrintStream;

/**
 * locate com.basic.java
 * Created by mastertj on 2018/12/17.
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        PrintStream printStream=new PrintStream(System.out);
        printStream.print("Hello Print system.out");
    }
}
