package org.example.stream;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class StreamDemo03 {
    public static void main(String[] args) {

        double[] scores = {93.5, 88.0, 79.5, 91.0, 84.5, 76.0, 95.0, 89.5, 82.0, 77.5};
        // 2. 데이터를 가공/분석 .. filtering, mapping, reducing, (sorting, distinct ..)
        // 60점이상인 점수를 각각 소숫점을 제외(버림)해서 평균을 구한다.

        double result = Arrays.stream(scores)
                .filter(score -> score >= 60)
                .map(Math::floor)
                .average()
                .orElse(0);

        System.out.println(result);
    }
}
