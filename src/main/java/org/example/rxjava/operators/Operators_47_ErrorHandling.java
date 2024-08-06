package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_47_ErrorHandling {
    public static void main(String[] args) {
        Observable.just(5, 2, 4, 0, 3)
                .map(i -> 10 / i)
                .retry()
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                     e -> System.out.println("RECEIVED ERROR: " + e));
    }
}