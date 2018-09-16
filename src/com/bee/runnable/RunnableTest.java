package com.bee.runnable;

import java.util.Date;

public class RunnableTest {
    public static void main(String args[]) {
        Runnable runnable = () -> System.out.println("Runnable " + new Date());

        Thread t = new Thread(() -> {
            for (int i = 0; i<=10; i++){
                System.out.println(i + " " + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(runnable);
        t.start();
        t2.start();
    }
}
