package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class UC2_7_SumAverage {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(2,4,6,8);

        int sum =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .sum();

        double average =
                numbers.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0);

        System.out.println(sum);
        System.out.println(average);
    }
}