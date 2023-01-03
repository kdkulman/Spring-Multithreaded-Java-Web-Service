package com.example.springmultithreadedjavawebservice;

public class Counter extends Thread{

    private String pId;
    public Counter(String pId) {
        this.pId = pId;
        start();
    }

    @Override
    public void run(){
        for (int i = 1; i <= 100; i++) {
            System.out.println("Process ID: " + pId + " / " + i);
        }
        System.out.println(pId + " finished.");
    }
}
