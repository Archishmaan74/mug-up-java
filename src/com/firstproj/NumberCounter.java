package com.firstproj;

public class NumberCounter extends Thread{
    @Override
    public void run() {
        int count = 0;
        for(int i = 1; i <= 50000000; i++){
            if(i % 10 == 1){
                count++;
            }
        }
        System.out.println("Count of numbers ending with 1: "+ count);
    }
}
