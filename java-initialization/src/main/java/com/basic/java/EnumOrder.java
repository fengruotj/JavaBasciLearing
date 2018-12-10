package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/10.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
}
