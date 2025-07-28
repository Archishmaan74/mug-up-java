package com.firstproj;

public class ThreadCheck {
    public static void main( String[] args){
        Car c1 = new Car();
        System.out.println("Thread Check: " + Thread.currentThread().getName());
    }
}
