package com.basic.java;

import java.util.HashSet;
import java.util.Set;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/20.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("tanjie");
        set.add("liuchong");
        set.add("tanjie");
        System.out.println(set);
    }
}
