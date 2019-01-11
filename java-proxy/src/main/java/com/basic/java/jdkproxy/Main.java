package com.basic.java.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * locate com.basic.java.jdkproxy
 * Created by MasterTj on 2019/1/11.
 */
public class Main {
    public static void main(String[] args) {
        Worker worker=new Worker("workerA");

        WorkerService workerService=getProxy(worker);
        workerService.work("watch");
        System.out.println("----------night---------");
        workerService.sleep();
    }

    public static WorkerService getProxy(WorkerService workerService){
        /**
         * 第一个参数：反射时使用的类加载器
         * 第二个参数：Proxy需要实现什么样的接口
         * 第三个参数：通过接口对象调用方法时，需要调用哪个类的invoke方法（invokeHandler）
         */
        WorkerService proxyInstance = (WorkerService) Proxy.newProxyInstance(workerService.getClass().getClassLoader(), workerService.getClass().getInterfaces(), new WorkerInvocationHandler(workerService));
        return proxyInstance;
    }
}
