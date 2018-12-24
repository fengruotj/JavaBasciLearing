package com.basic.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/24.
 */
public class SystemInput {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        int index=1;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println("line"+index+" :"+line);
            index++;
        }
    }
}
