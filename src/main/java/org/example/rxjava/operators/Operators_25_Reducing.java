package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_25_Reducing {
    public static void main(String[] args) {
        Observable.just(5, 3, 7, 11, 2, 14)
                .all(i -> i < 10)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}