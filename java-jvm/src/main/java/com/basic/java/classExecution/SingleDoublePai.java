package com.basic.java.classExecution;

/**
 * locate com.basic.java.classExecution
 * Created by MasterTj on 2018/12/14.
 */
class Eat {
}

class Drink {
}

class Father {
    public void doSomething(Eat arg) {
        System.out.println("爸爸在吃饭");
    }

    public void doSomething(Drink arg) {
        System.out.println("爸爸在喝水");
    }
}

class Child extends Father {
    public void doSomething(Eat arg) {
        System.out.println("儿子在吃饭");
    }

    public void doSomething(Drink arg) {
        System.out.println("儿子在喝水");
    }
}

public class SingleDoublePai {
    public static void main(String[] args) {
        Father father = new Father();
        Father child = new Child();
        father.doSomething(new Eat());
        child.doSomething(new Drink());
    }
}
