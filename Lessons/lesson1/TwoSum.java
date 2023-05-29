package ru.gb.lesson1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
//        int[] indexes = twoSum.findSum(new int[]{32, 2, 5, 7, 12, 17}, 9);
        int[] indexes = twoSum.findSum(new int[]{19, -10, 5, 7, 12, 17}, 9);
        System.out.println(Arrays.toString(indexes)); // [0, 2]
    }

    // Нужно найти 2 таких индекса {i, j}, что array[i] + array[j] == target
    public int[] findSum(int[] array, int target) {
        // 2, 5, 7, 12, 17, 2 --- 4
        // 2 -> 5
        // 5 -> 1
        // 7 -> 2
        // 12 -> 3
        // 17 -> 4
        Map<Integer, Integer> map = new HashMap<>(); // [x1, x2, x3, ..., x16]
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int a = array[i]; // 2, i = 0
            int b = target - a; // 2
            Integer pair = map.get(b); // index of 5
            if (pair != null && pair != i) {
                return new int[]{i, pair};
            }
        }

//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] + array[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
        return new int[]{-1, -1};
    }

}
