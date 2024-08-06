package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;

public class Operators_05_Filtering {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .filter(s -> s.length() != 5)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}