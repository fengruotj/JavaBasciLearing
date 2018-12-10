package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/10.
 */
class ParaFather{
    public String Name;
    public int age;
    private double money;
    ParaFather(double money){
        this.money = money;
    }
    public double getMoney() {
        return money;
    }
}
public class ParaSon extends ParaFather {
    ParaSon(double money) {
        super(money);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        ParaSon son = new ParaSon(2014);
        son.Name = "Zhang San";
        System.out.println(son.getMoney());
    }
}

