package com.basic.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/19.
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("tanjie","liuchong","chenze"));
        ListIterator<String> listIterator = list.listIterator();

        List<String> stringList = Arrays.asList("tanjie", "liuchong", "chenze");
        System.out.println(stringList.getClass());
    }
}
