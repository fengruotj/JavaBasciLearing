package com.basic.java;

import java.util.Scanner;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/15.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
