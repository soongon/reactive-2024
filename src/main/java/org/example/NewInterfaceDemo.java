package org.example;

public class NewInterfaceDemo {

}

@FunctionalInterface
interface LegacyInterface {
    double PI = 3.14;

    int addTwoNumbers(int a, int b);

    default int subtractTwoNumbers(int a, int b) {
        return a - b;
    }

    static int multiplyTwoNumbers(int a, int b) {
        return a * b;
    }
}
