package ru.gb.lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("java", "python", "c#", "c++", "kotlin", "javascript"));

        List<String> filtered = list.stream()
//                .filter(s1 -> s1.length() >= 4)
                .filter(StreamDemo::hasLengthGreaterOrEqualsToFour)
                .map(String::toUpperCase)
//                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    static boolean hasLengthGreaterOrEqualsToFour(String s) {
        return s.length() >= 4;
    }

}
