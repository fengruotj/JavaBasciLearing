package com.basic.java.gc;

import java.lang.ref.SoftReference;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/11.
 */
public class SoftRef {
    public static void main(String args[]) {
        String fk = "do you like me";
        SoftReference<String> soft = new SoftReference<String>(fk);
        System.out.println(soft.get());
    }
}
