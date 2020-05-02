package com.lgh.controller;
//TODO A1 MyThread2类extends Thread
public class MyThread2 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <50 ; i++) {
            System.out.println(this.getName()+":"+i);
            //TODO A3 MyThread2礼让一次
            Thread.yield();
        }
    }
}
