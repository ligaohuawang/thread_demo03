package com.lgh.controller;

public class ThreadController {
    public static void main(String[] args) {
        //TODO A4 创建两个线程
        MyThread myThread1 = new MyThread();
        MyThread2 myThread2 = new MyThread2();

        //TODO A5 启动两个线程
        myThread1.start();
        myThread2.start();

    }
}
