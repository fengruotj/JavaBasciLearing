package com.basic.java;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/17.
 */
class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist=new ArrayList<>();
//        flist.add(new Apple());
//        flist.add(new Jonathan());
//        flist.add(new Object());
        flist.add(null);
    }
}
