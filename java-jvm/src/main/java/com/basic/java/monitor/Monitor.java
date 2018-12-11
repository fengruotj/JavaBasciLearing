package com.basic.java.monitor;

import java.util.ArrayList;
import java.util.List;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/11.
 */
public class Monitor {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        int i=0;
        while (true){
            i=i % 100;
            Integer integer = list.get(i);
            System.out.println(integer);
            i++;
        }
    }
}
