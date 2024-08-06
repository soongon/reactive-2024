package org.example;


import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> p = i -> i % 3 == 0;
        System.out.println(p.test(10));

    }
}

/*
class MyPredicate<T> implements Predicate<Integer> {

    @Override
    public boolean test(Integer i) {
        return i % 3 == 0;
    }
}*/
