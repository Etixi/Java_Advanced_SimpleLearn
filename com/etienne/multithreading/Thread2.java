package com.etienne.multithreading;

public class Thread2 implements Runnable{
    @Override
    public void run(){
        try {
            System.out.println("Thread 2 is running");
        }catch (Exception e){
            // Throwing an exception
            System.out.println("Exception raised" + e);
        }
    }
}
