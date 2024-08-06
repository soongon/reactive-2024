package org.example.rxjava.scheduling;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Scheduling_05_Infinite {
    public static void main(String[] args) {
        Observable.interval(1, TimeUnit.SECONDS)
                  .map(l -> intenseCalculation((l)))
                  .subscribe(System.out::println);
        sleep(Long.MAX_VALUE);
    }

    public static <T> T intenseCalculation(T value) {
        sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}