package com.example.demo;

public class MainClass {

    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.example.demo.Class1");
            aClass.getClassLoader().loadClass("com.example.demo.Class2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
