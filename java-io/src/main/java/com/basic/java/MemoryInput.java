package com.basic.java;

import java.io.IOException;
import java.io.StringReader;

/**
 * locate com.basic.java
 * Created by mastertj on 2018/12/18.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in=new StringReader(BufferedInputReader.read("D:\\ProgramProjects\\IntelJIDEAProject\\IntelliJIDEA15.0.2\\WorkProject\\JavaBasciLearing\\java-io\\src\\main\\java\\com\\basic\\java\\BufferedInputReader.java"));
        int c;
        while ((c=in.read())!=-1){
            System.out.println((char)c);
        }
    }
}
