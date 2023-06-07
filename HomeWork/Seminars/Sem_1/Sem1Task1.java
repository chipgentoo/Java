package Seminars.Sem_1;

import java.util.Arrays;
import java.util.Random;

// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

public class Sem1Task1 {
    public static int[] RandomArray() {
        Random rand = new Random(); // создаем объект класса Random
        int length = rand.nextInt(100); // рандомная длина массива до 100 значений
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = rand.nextInt(100); // заполняем каждый элемент случайным числом от 0 до 99
        }
        return nums;
    }

    public static int minValue(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) minVal = arr[i];
        }
        return minVal;
    }
    public static int maxValue(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) maxVal = arr[i];
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] nums = RandomArray();
        System.out.println(Arrays.toString(nums));
        System.out.println(
                "\nОбщая длина массива = " + nums.length +
                "\nМинимальное значение = " + minValue(nums) +
                "\nМаксимальное значение = " + maxValue(nums)
        );
    }
}