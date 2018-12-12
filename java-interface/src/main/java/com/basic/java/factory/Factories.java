package com.basic.java.factory;

/**
 * locate com.basic.java.factory
 * Created by MasterTj on 2018/12/12.
 * 工厂设计模式
 */
interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}
class Implementation1 implements Service{
    Implementation1() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public void method1() {
        // TODO Auto-generated method stub
        System.out.println("Implementation1 method1");
    }
    @Override
    public void method2() {
        // TODO Auto-generated method stub
        System.out.println("Implementation1 method2");
    }
}

class Implementation1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        // TODO Auto-generated method stub
        return new Implementation1();
    }
}

class Implementation2 implements Service{
    Implementation2() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public void method1() {
        // TODO Auto-generated method stub
        System.out.println("Implementation2 method1");
    }
    @Override
    public void method2() {
        // TODO Auto-generated method stub
        System.out.println("Implementation2 method2");
    }
}

class Implementation2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        // TODO Auto-generated method stub
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }
}
