package org.example;

public class RunnableDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("main thread: " + i);
        }

        Thread t = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.println("another thread: " + i);
            }
        });
        t.start();

    }
}


