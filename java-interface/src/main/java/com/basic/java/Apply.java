package com.basic.java;

import java.util.Arrays;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/12.
 */

class Processor{
    public String name(){
        return getClass().getSimpleName();
    }
    Object process(Object input){
        return input;
    }
}
class UpCase extends Processor{
    String process(Object input){
        return input.toString().toUpperCase();
    }
}
class DownCase extends Processor{
    String process(Object input){
        return input.toString().toLowerCase();
    }
}
class Splitter extends Processor{
    String process(Object input){
        return Arrays.toString(input.toString().split(" "));
    }
}
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor:" + p.name());
        System.out.println(p.process(s));
    }

    public static final String S = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new UpCase(), S);
        process(new DownCase(), S);
        process(new Splitter(), S);
    }
}
