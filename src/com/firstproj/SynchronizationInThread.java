package com.firstproj;

public class SynchronizationInThread extends Thread{
    private Counter counter;

    public SynchronizationInThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i=0; i < 1000; i++){
            counter.increment();
        }
    }
    public static void main(String[] args){
        Counter counter = new Counter();
        SynchronizationInThread t1 = new SynchronizationInThread(counter);
        SynchronizationInThread t2 = new SynchronizationInThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("Total count: " + counter.getCount());
    }
}

class Counter{
    private int count = 0;   // SHARED RESOURCE

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
