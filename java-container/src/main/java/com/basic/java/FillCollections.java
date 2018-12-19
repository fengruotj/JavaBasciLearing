package com.basic.java;

import java.util.*;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/19.
 */
public class FillCollections {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(4);
        List<String> copyList = Collections.nCopies(5, new String("caozhiduan"));

        List<String> list1 = new ArrayList<>(copyList);
        Collections.fill(list1,new String("tanjie"));
        List<String> list2 = Arrays.asList("tanjie");

        String[] strings = list1.toArray(new String[0]);
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(list);
        System.out.println(list1);
    }
}
