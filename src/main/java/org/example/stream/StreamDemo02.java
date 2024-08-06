package org.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamDemo02 {
    public static void main(String[] args) {
        // 1. 데이터를 준비
        // 학생들의 점수 데이터 (double로 된 점수 10개, 예)93.5)
        double[] scores = {93.5, 88.0, 79.5, 91.0, 84.5, 76.0, 95.0, 89.5, 82.0, 77.5};
        // 2. 데이터를 가공/분석 .. filtering, mapping, reducing, (sorting, distinct ..)
        DoubleStream doubleStream = Arrays.stream(scores);
        // 60점이상인 점수를 각각 소숫점을 제외(버림)해서 평균을 구한다.
        OptionalDouble result = doubleStream
                .filter(score -> score >= 60)
                .map(score -> Math.floor(score))
                .average();
        double average = result.orElse(0);
        System.out.println(average);

        // 60점 이상 필터링, double-->int 매핑, 평균(집계)

    }
}
