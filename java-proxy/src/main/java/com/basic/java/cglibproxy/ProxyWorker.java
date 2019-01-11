package com.basic.java.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * locate com.basic.java.cglibproxy
 * Created by MasterTj on 2019/1/11.
 */
public class ProxyWorker implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //invoke调用子类重写的方法
        System.out.println("前驱通知");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("后驱通知");
        return invoke;
    }
}
