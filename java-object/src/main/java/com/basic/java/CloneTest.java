package com.basic.java;

/**
 * locate com.basic.java
 * Created by MasterTj on 2019/1/8.
 */
public class CloneTest {
    private static class Person implements Cloneable{
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Person shadowCopy() throws CloneNotSupportedException {
            return (Person) this.clone();
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person=new Person("tanjie",18);
        System.out.println(person);
        System.out.println(person.hashCode());
        Person shadowCopy = person.shadowCopy();
        System.out.println(shadowCopy);
        System.out.println(shadowCopy.hashCode());
        System.out.println(person==shadowCopy);
    }
}
