package com.basic.java.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/11.
 * 虚引用
 */
public class PhRef {
    public static void main(String args[]) {
        String temp = "hello china";
        ReferenceQueue<String> queue = new ReferenceQueue<>();
        PhantomReference<String> phReference = new PhantomReference<String>(temp, queue);
        System.out.println(phReference.get());
    }
}
