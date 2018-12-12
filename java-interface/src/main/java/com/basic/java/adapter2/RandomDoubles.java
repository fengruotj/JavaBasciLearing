package com.basic.java.adapter2;

import java.util.Random;

/**
 * locate com.basic.java.adapter2
 * Created by MasterTj on 2018/12/12.
 */
public class RandomDoubles {
    private static Random rand = new Random(47);
    public double next(){
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i ++){
            System.out.println(rd.next() + " ");
        }
    }
}
