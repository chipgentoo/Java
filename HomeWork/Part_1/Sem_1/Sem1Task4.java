package Sem_1;

import java.util.Arrays;

/**
 * 4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
 * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
 * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
 * Примеры:
 * [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
 * [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
 * При каком n в какую сторону сдвиг, можете выбирать сами.
 */
public class Sem1Task4 {
    public static void shiftToRight(int[] array, int value){
        for (int i = 0; i < value; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length-1; j >= 1; j--) {
                array[j] = array[j-1];
            }
            array[0] = lastValue;
        }
    }
    public static void shiftToLeft(int[] array, int value){
        for (int i = 0; i < value; i++) {
            int firstValue = array[0];
            for (int j = 1; j <= array.length-1; j++) {
                array[j-1] = array[j];
            }
            array[array.length-1] = firstValue;
        }
    }
    public static void main(String[] args) {
        int[] array = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = 3; // сдвиг
        System.out.println("Входящий массив" + Arrays.toString(array));
        shiftToRight(array, n);
        System.out.println("Сдвинули вправо на " + n);
        System.out.println("Исходящий массив" + Arrays.toString(array));
        shiftToLeft(array, n-1);
        System.out.println("Сдвинули влево на " + (n - 1));
        System.out.println("Исходящий массив" + Arrays.toString(array));
    }
}