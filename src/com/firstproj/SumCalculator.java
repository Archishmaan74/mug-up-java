package com.firstproj;

public class SumCalculator implements Runnable{

    @Override
    public void run() {
        long sum = 0;
        for(int i=0; i <= 1000000000; i++){
            sum+=i;
        }
        System.out.println("Sum: " + sum);
    }
}
