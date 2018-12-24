package com.basic.java;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/24.
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        Reader reader=new InputStreamReader(new BufferedInputStream(System.in));
        int read=0;
        int count=0;
        //read方法一次读取一个字符（char字符在GBK编码下默认占用两个字节,在UTF-8编码下英文1个字节 中文三个字节）
        while ((read=reader.read())!=-1){
            System.out.println("character"+(++count)+" :"+(char) read);
        }
        reader.close();
    }
}
