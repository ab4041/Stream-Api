package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UC2_9_SortAscending {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(9,5,2,7,1);

        List<Integer> sorted =
                numbers.stream()
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(sorted);
    }
}