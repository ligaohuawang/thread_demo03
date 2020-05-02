package com.lgh.controller;
//TODO A1 MyThread类extends Thread
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <50 ; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
}
