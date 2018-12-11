package com.basic.java.gc;

import java.lang.ref.WeakReference;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/11.
 */
public class WeakRef {
    public static void main(String args[]) {
        String temp = "fk that";
        WeakReference<String> wReference = new WeakReference<String>(temp);
        System.err.println(wReference.get());
    }
}
