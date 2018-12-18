package com.basic.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * locate com.basic.java
 * Created by mastertj on 2018/12/18.
 */
enum Students{
    TANJIE,ZHANGWANGCHENG,HAOWEIFENG,HAOTONGBO;
    private String name;
    public String getName(String name){
        this.name=name;
        return name;
    }
}
public class EnumTest {
    public static void main(String[] args) throws IOException {
        for (Students students : Students.values()) {
            System.out.println(students.getName(students.name()));
        }

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        while ((line=bufferedReader.readLine())!=null){
            Students students=Students.valueOf(line);
            switch (students){
                case TANJIE:
                    System.out.println("tanjie");
                    break;
                case HAOTONGBO:
                    System.out.println("haotongbo");
                    break;
                case HAOWEIFENG:
                    System.out.println("haoweifeng");
                    break;
                case ZHANGWANGCHENG:
                    System.out.println("zhangwangcheng");
                    break;
                default:
                    System.out.println("something wrong");
                    break;
            }
        }
    }
}
