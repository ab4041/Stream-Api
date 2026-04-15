package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UC2_6_MinMaxEven {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(2,4,6,8);

        Optional<Integer> min =
                numbers.stream().min(Integer::compare);

        Optional<Integer> max =
                numbers.stream().max(Integer::compare);

        min.ifPresent(System.out::println);
        max.ifPresent(System.out::println);
    }
}