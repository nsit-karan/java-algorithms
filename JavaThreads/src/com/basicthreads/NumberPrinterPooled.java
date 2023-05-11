package com.basicthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumberPrinterPooled {
    public static void main(String[] args) {

        ExecutorService e = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 1000; i++) {
            NumberPrinter np = new NumberPrinter(i);
            e.execute(np);
        }
    }
}
