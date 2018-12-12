package com.basic.java.anonym;

import com.basic.java.Contents;

/**
 * locate com.basic.java.anonym
 * Created by MasterTj on 2018/12/12.
 * 匿名内部类
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }
    public static void main(String[] args) {
        Parcel7 p7 = new Parcel7();
        Contents c = p7.contents();
    }
}
