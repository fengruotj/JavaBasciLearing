package com.basic.java.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * locate com.basic.java.jdkproxy
 * Created by MasterTj on 2019/1/11.
 */
public class WorkerInvocationHandler implements InvocationHandler {
    private WorkerService workerService;

    public WorkerInvocationHandler(WorkerService workerService) {
        this.workerService = workerService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            System.out.println("前驱通知");
            return method.invoke(workerService,args);
        } finally {
            System.out.println("后驱通知");
        }
    }
}
