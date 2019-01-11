package com.basic.java.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * locate com.basic.java.jdkproxy
 * Created by MasterTj on 2019/1/11.
 */
public class Main {
    public static void main(String[] args) {
        Worker worker=new Worker("workerA");

        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Worker.class);
        enhancer.setCallback(new ProxyWorker());
        Worker proxyWorker = (Worker) enhancer.create(new Class[]{String.class},new String[]{"workerA"});

        proxyWorker.work("watch");
        System.out.println("----------night---------");
        proxyWorker.sleep();
    }
}
