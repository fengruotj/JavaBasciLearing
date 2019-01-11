package com.basic.java.staicproxy;

/**
 * locate com.basic.java
 * Created by MasterTj on 2019/1/11.
 * 静态代理设计模式
 */
public class Main {
    public static void main(String[] args) {
        ProxyWorker proxyWorker=new ProxyWorker();
        proxyWorker.work("watch");
        System.out.println("----------night---------");
        proxyWorker.sleep();
    }
}
