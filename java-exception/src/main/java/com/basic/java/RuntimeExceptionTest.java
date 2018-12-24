package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/24.
 */
public class RuntimeExceptionTest {
    public static void main(String[] args) {
        System.out.println("RuntimeExcetion test");
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    System.out.println(Thread.currentThread() + " hold lock. notify @ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();

        RuntimeException error_runtimeExcetion = new RuntimeException("error RuntimeExcetion");
        throw  error_runtimeExcetion;
    }
}
