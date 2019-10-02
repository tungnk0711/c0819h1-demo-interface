package com.codegym;

public class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("meo meo");
    }

    public void go(){
        System.out.println("di..");
    }

    @Override
    public void show(){
        System.out.println("Cat hello");
    }
}
