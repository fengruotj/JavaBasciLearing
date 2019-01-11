package com.basic.java.staicproxy;

/**
 * locate com.basic.java
 * Created by MasterTj on 2019/1/11.
 */
public class Worker implements WorkerService{
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(String type){
        switch (type){
            case "watch":
                System.out.println("----------watch TV---------");
                break;
            default:
                break;
        }
    }

    @Override
    public void sleep() {
        System.out.println("----------watch TV---------");
    }
}
