package com.basic.java;

import java.util.Stack;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/20.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("tanjie");
        stack.push("liuchong");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
