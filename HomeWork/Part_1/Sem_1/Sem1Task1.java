package Sem_1;

import java.util.Arrays;
import java.util.Random;

// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы;

public class Sem1Task1 {
    public static int[] RandomArray() {
        Random rand = new Random(); // создаем объект класса Random
        int length = rand.nextInt(100); // рандомно установленная длина массива до 100 значений
        int[] numbs = new int[length];
        for (int i = 0; i < length; i++) {
            numbs[i] = rand.nextInt(100); // заполняем каждый элемент случайным числом от 0 до 99
        }
        return numbs;
    }

    public static int minValue(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < minVal) minVal = j;
        }
        return minVal;
    }
    public static int maxValue(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > maxVal) maxVal = j;
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] numbs = RandomArray();
        System.out.println(Arrays.toString(numbs));
        System.out.println(
                "\nОбщая длина массива = " + numbs.length +
                "\nМинимальное значение = " + minValue(numbs) +
                "\nМаксимальное значение = " + maxValue(numbs)
        );
    }
}