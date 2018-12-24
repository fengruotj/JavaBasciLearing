package com.basic.java;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/24.
 * InputStream 面向字节的，一次读取一个字节
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=new BufferedInputStream(System.in);
        int read;
        int count=0;
        //read方法一次读取一个字节 read的值在0-256之间 2^8
        while ((read=inputStream.read())!=-1){
            System.out.println("byte"+(++count)+" :"+(char) read);
        }
        inputStream.close();
    }
}
