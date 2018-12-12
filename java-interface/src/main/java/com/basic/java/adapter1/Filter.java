package com.basic.java.adapter1;

/**
 * locate com.basic.java.adapter
 * Created by MasterTj on 2018/12/12.
 */
public class Filter{
    public String name(){
        return getClass().getSimpleName();
    }
    public WaveForm process(WaveForm input){
        return input;
    }
}
