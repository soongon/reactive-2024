package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_49_Action {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .doOnNext(s -> System.out.println("Processing: " + s))
                .map(String::length)
                .subscribe(i -> System.out.println("Received: " + i));
    }
}