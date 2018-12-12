package com.basic.java.adapter1;

/**
 * locate com.basic.java.adapter
 * Created by MasterTj on 2018/12/12.
 */
public class BandPass extends Filter {
    double lowCutoff,highCutoff;
    public BandPass(double lowCutoff,double highCutoff){
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public WaveForm process(WaveForm input){
        return input;
    }
}
