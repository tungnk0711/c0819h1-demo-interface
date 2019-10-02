package com.codegym;

public class AirPlane implements FlyAble, RunAble{
    @Override
    public void fly() {
        System.out.println("10000m");
    }

    @Override
    public void run() {

    }
}
