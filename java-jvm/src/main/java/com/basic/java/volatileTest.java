package com.basic.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/20.
 */
class Simple{
    private int i;
    public void add(){
        i++;
    }

    public int getI() {
        return i;
    }
}

class VolatileSimple{
    private volatile int i;

    public void add(){
        i++;
    }

    public int getI() {
        return i;
    }
}

class SynchronizedSimple{
    private int i;

    public synchronized void add(){
        i++;
    }

    public int getI() {
        return i;
    }
}

public class volatileTest {
    private static ExecutorService executor= Executors.newCachedThreadPool();

    public static void testSimple(){
        Simple simple=new Simple();
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        simple.add();
                    }
                }
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(100,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(simple.getI());
    }

    public static void testVolatileSimple(){
        VolatileSimple volatileSimple=new VolatileSimple();
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        volatileSimple.add();
                    }
                }
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(100,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(volatileSimple.getI());
    }

    public static void testSynchronizedSimple(){
        SynchronizedSimple synchronizedSimple=new SynchronizedSimple();
        for (int i = 0; i < 10; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        synchronizedSimple.add();
                    }
                }
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(100,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(synchronizedSimple.getI());
    }

    public static void main(String[] args) {
        //testSimple();
        //testVolatileSimple();
        testSynchronizedSimple();
    }
}
