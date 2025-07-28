package com.firstproj;

public class WithoutMultiThreading {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
            long sum = 0;
            for(int i=0; i <= 1000000000; i++){
                sum+=i;
            }
            System.out.println("Sum: " + sum);

            int count = 0;
            for(int i = 1; i <= 50000000; i++){
                if(i % 10 == 1){
                    count++;
                }
            }
            System.out.println("Count of numbers ending with 1: "+ count);

        System.out.println("Time taken without multithreading: "+ (System.currentTimeMillis() - startTime) + " ms");
    }
}
