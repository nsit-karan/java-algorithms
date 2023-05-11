package com.basicthreads;

public class NumberPrinter implements Runnable {
    int no;

    NumberPrinter(int no) {
        this.no = no;
    }

    @Override
    public void run() {
        System.out.println("I am printing : " + this.no + "," + Thread.currentThread().getName());
    }
}
