package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.remove("World");

        System.out.println(stringList);

        //List<String> immutableStringList = List.of("Hello", "World");
        //immutableStringList.add("Java");
        //immutableStringList.remove("World");
        //System.out.println(immutableStringList);


    }
}
