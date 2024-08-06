package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // 데이터를 외부에서 (IO) 가져온다.
        List<String> favoriteColors = new ArrayList<>();
        favoriteColors.add("Red");
        favoriteColors.add("Blue");
        favoriteColors.add("Green");
        favoriteColors.add("Yellow");
        favoriteColors.add("Orange");
        favoriteColors.add("Violet");
        favoriteColors.add("Pink");

        // filtering, mapping, reducing
        // 글자수가 4글자 이상인 색깔을 대문자로 변환해서 출력한다.
        // 1. 스트림으로 변환
        Stream<String> colors = favoriteColors.stream();
        colors
                .filter(i -> i.length() >= 4)
                .map(String::toUpperCase)
                .filter(i -> i.endsWith("T"))
                .forEach(System.out::println);

        /*
        List<String> newList = new ArrayList<>();
        for (String color : favoriteColors) {
            if (color.length() >= 4) {
                newList.add(color.toUpperCase());
            }
        }
        System.out.println(newList);
        */
    }
}
