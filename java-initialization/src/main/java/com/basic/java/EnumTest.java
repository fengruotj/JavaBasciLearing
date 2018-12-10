package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/10.
 */
public class EnumTest{
    public EnumSet es;
    EnumTest(EnumSet es){
        this.es = es;
    }
    public enum EnumSet{
        FIRST,SECOND,THIRD
    }
    public void doSwitchPrint(){
        switch(es){
            case FIRST:
                System.out.println("This is First");
                break;
            case SECOND:
                System.out.println("This is Second");
                break;
            case THIRD:
                System.out.println("This is Third");
                break;
            default:
                System.out.println("This is Error");
        }
    }
    public static void main(String[] args) {
        EnumTest et1 = new EnumTest(EnumSet.FIRST);
        EnumTest et2 = new EnumTest(EnumSet.SECOND);
        EnumTest et3 = new EnumTest(EnumSet.THIRD);
        et1.doSwitchPrint();
        et2.doSwitchPrint();
        et3.doSwitchPrint();
    }
}
