package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/19.
 */
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student A=new Student(1,"tanjie");
        Student B=new Student(2,"liuchong");
        System.out.println(A==B);
        System.out.println(A.equals(B));
    }
}
