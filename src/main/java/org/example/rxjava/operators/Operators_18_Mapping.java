package org.example.rxjava.operators;

import io.reactivex.rxjava3.core.Observable;
import java.util.Comparator;

public class Operators_18_Mapping {
    public static void main(String[] args) {
        Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                .sorted(Comparator.reverseOrder())
                .subscribe(System.out::print);
    }
}