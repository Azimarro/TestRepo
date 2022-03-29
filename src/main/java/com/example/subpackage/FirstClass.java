package com.example.subpackage;

public class FirstClass {

    private String name;
    private int age;

    public FirstClass(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
