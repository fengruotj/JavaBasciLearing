package com.basic.java;

import java.util.Vector;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/21.
 */
public class SynchronizedVectorTest {
    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            for(int i = 0; i < 10; i++){
                vector.add(i);
            }

            Thread removeThread = new Thread(new Runnable() {
                public void run() {
                    synchronized (vector) {
                        for (int i = 0; i < vector.size(); i++) {
                            vector.remove(i);
                        }
                    }
                }
            });

            Thread printThread = new Thread(new Runnable() {
                public void run() {
                    synchronized (vector) {
                        for (int i = 0; i < vector.size(); i++) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                            System.out.println(vector.get(i));
                        }
                    }
                }
            });

            removeThread.start();
            printThread.start();
        }
    }
}
