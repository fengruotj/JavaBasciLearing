package com.basic.java.adapter1;

/**
 * locate com.basic.java.adapter
 * Created by MasterTj on 2018/12/12.
 */
public class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff = cutoff;
    }
    public WaveForm prcess(WaveForm input){
        return input;
    }
}
