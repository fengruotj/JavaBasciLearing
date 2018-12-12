package com.basic.java.anonym;

/**
 * locate com.basic.java.anonym
 * Created by MasterTj on 2018/12/12.
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x){
            @Override
            public int value() {
                return super.value() * 11;
            }
        };
    }
}
