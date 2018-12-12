package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/12.
 * 内部类
 */
public class Parcell {
    class Contents{
        private int i = 11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        public Destination(String whereto) {
            // TODO Auto-generated constructor stub
            label = whereto;
        }
        String readLabel(){
            return label;
        }
    }
    public Contents contents(){
        return new Contents();
    }
    public Destination destination(String s){
        return new Destination(s);
    }
    public void ship(String dest){
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args) {
        Parcell p1 = new Parcell();
        p1.ship("Inner Class");
        Parcell p2 = new Parcell();
        Contents c = p2.contents();
        Parcell.Destination d = p2.destination("Class Inner");
    }
}
