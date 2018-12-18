package com.basic.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * locate com.basic.java
 * Created by mastertj on 2018/12/18.
 */
public class BufferedInputReader {
    public static String read(String fileName) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(fileName));
        String s=null;
        StringBuilder stringBuilder=new StringBuilder();
        while ((s=bufferedReader.readLine())!=null){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("D:\\ProgramProjects\\IntelJIDEAProject\\IntelliJIDEA15.0.2\\WorkProject\\JavaBasciLearing\\java-io\\src\\main\\java\\com\\basic\\java\\BufferedInputReader.java"));
    }
}
