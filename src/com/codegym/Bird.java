package com.codegym;

public class Bird extends Animal implements FlyAble, RunAble{
    @Override
    public void fly() {
        System.out.println("1000m");
    }

    @Override
    public void run() {

    }

    public void go(){

        System.out.println(FlyAble.SPEED);
    }

    @Override
    public void speak() {

    }
}
