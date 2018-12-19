package com.basic.java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * locate com.basic.java
 * Created by MasterTj on 2018/12/19.
 */
public class UseCaseTracker {
    public static void trackUseCase(List<Integer> uscases, Class<?> el){
        for (Method method : el.getDeclaredMethods()) {
            UseCase annotation = method.getAnnotation(UseCase.class);
            if(annotation!=null){
                System.out.println("UseCase: id:"+ annotation.id()+" description: "+annotation.description());
                uscases.remove(new Integer(annotation.id()));
            }
        }

        for (Integer uscase : uscases) {
            System.out.println("Results: "+ uscase);
        }
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,47,48,49,50,51);
        trackUseCase(list,PasswordUtils.class);
    }
}
