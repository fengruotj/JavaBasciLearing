package com.basic.java.adapter1;

/**
 * locate com.basic.java.adapter
 * Created by MasterTj on 2018/12/12.
 */
public class WaveForm{
    private static long counter;
    private final long id = counter++;
    public String toString(){
        return "Wave Form" + id;
    }

}
