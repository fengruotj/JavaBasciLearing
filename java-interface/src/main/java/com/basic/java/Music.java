package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/12.
 */

abstract class Instrument{
    private int i;
    public String what(){
        return "Instrumet";
    }
    public abstract void play(String s);
    public void adjust(){};
}
class Wind extends Instrument {
    public String what(){
        return "Wind";
    }
    public void play(String s){
        System.out.println("Wind.play" + s);
    }
    public void adjust(){};
}
class Percussion extends Instrument {
    public String what(){
        return "Percussion";
    }
    public void play(String s){
        System.out.println("Percussion.play" + s);
    }
    public void adjust(){};
}
class Stringed extends Instrument {
    public String what(){
        return "Stringed";
    }
    public void play(String s){
        System.out.println("Stringed.play" + s);
    }
    public void adjust(){};
}
class Brass extends Instrument {
    public String what(){
        return "Brass";
    }
    public void play(String s){
        System.out.println("Brass.play" + s);
    }
    public void adjust(){};
}
class WoodWind extends Instrument {
    public String what(){
        return "WoodWind";
    }
    public void play(String s){
        System.out.println("WoodWind.play" + s);
    }
    public void adjust(){};
}

public class Music{
    static void tune(Instrument i ){
        i.play("finish");
    }
    static void tuneAll(Instrument[] e){
        for(Instrument i:e){
            tune(i);
        }
    }
    public static void main(String[] args) {
        Instrument[] iArray = {
                new Wind(),new Percussion(),new Brass(),new Stringed(),new WoodWind()
        };
        tuneAll(iArray);
    }
}
