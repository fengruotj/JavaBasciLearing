package com.basic.java.classloader;

import java.util.Random;

/**
 * locate com.basic.java.classloader
 * Created by MasterTj on 2019/3/3.
 */
class Initable{
    static final int staticFinal = 45;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static{
        System.out.println("Initializing Initable");
        System.out.println("Initable---------------");
    }
}
class Initable2{
    static int staticNonFinal = 145;
    static{
        System.out.println("Initializing Initable2");
        System.out.println("Initable2---------------");
    }
}
class Initable3{
    static int staticNonFinal = 54;
    static{
        System.out.println("Initializing Initable3");
        System.out.println("Initable3---------------");
    }
}
public class ClassInitialization {
    public static Random rand = new Random(45);
    public static void main(String[] args) throws ClassNotFoundException {
        Class initable = Initable.class;
        System.out.println("After Creating Initable Ref");
        System.out.println(Initable.staticFinal);
        System.out.println("------------------");
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNonFinal);
        Class initable3 = Class.forName("com.basic.java.classloader.Initable3");
        System.out.println("After Creating Initable3 Ref");
        System.out.println(Initable3.staticNonFinal);
    }
}
