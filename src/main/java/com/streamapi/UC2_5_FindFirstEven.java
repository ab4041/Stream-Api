package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UC2_5_FindFirstEven {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(3,7,9,4,8);

        Optional<Integer> firstEven =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .findFirst();

        firstEven.ifPresent(System.out::println);
    }
}