package com.basic.java.staicproxy;

/**
 * locate com.basic.java
 * Created by MasterTj on 2019/1/11.
 */
public class ProxyWorker implements WorkerService{
    private Worker worker=new Worker("workerA");

    @Override
    public void work(String type) {
        System.out.println("准备开始Work");
        worker.work("watch");
        System.out.println("结束Work");
    }

    @Override
    public void sleep() {
        worker.sleep();
    }
}
