package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/12.
 */
class Parcell4{
    private class PContents implements Contents{
        private int i = 11;
        @Override
        public int value() {
            // TODO Auto-generated method stub
            return i;
        }
    }
    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereto) {
            // TODO Auto-generated constructor stub
            label = whereto;
        }
        @Override
        public String readLabel() {
            // TODO Auto-generated method stub
            return label;
        }
    }
    public Destination destination(String s){
        return new PDestination(s);
    }
    public Contents contents(){
        return new PContents();
    }
}
public class TestParcell {
    public static void main(String[] args) {
        Parcell4 p = new Parcell4();
        Contents c = p.contents();
        Destination d = p.destination("Inner Class");
        System.out.println(d.readLabel());
        System.out.println(c.value());
        //因为PContents是private 所以不能被访问
        //Parcell4.PContents pc = p.new PContents();
    }
}

