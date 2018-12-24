package com.basic.java;

import java.nio.charset.Charset;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/24.
 */
public class StringTest {
    public static void main(String[] args) {
        String str="str";
        char a='a';
        System.out.println(a);
        System.out.println(str.getBytes().length);
        System.out.println(Charset.defaultCharset());
    }
}
