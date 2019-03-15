package com.basic.java;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/17.
 */
public class ListFun {
    public static void main(String[] args) {
        List<Fruit> list=new ArrayList<>();
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Orange());

        System.out.println(list);
    }
}
