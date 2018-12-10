package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/10.
 * 代理的使用
 */
public class Delegation {
    public DelegationClass delegationClass=new DelegationClass();

    public void delegationPrint(){
        delegationClass.print();
    }

    public void delegationSay(){
        delegationClass.say();
    }

    public void delegationClean(){
        delegationClass.clean();
    }
}

class DelegationClass{
    public void print(){
        System.out.println("print");
    }
    public void say(){
        System.out.println("say");
    }
    public void clean(){
        System.out.println("clean");
    }
}
