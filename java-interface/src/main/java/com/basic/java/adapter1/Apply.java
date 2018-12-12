package com.basic.java.adapter1;

/**
 * locate com.basic.java.adapter
 * Created by MasterTj on 2018/12/12.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor:" + p.name());
        System.out.println(p.process(s));
    }

    public static final String S = "Disagreement with beliefs is by definition incorrect";
}
