package Sem_1;

import java.util.Scanner;

/**
2. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 и с помощью цикла(-ов) заполнить его диагональные элементы единицами
 (можно только одну из диагоналей, если обе сложно).
 Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 */
public class Sem1Task2 {

    public static void printArray(int[][] array){
        int sizeArray = array.length;
        for (int[] items : array) {
            for (int j = 0; j < sizeArray; j++) {
                System.out.print(items[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void initZero(int[][] array){
        int sizeArray = array.length;
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                array[i][j] = 0;
            }
        }
    }
    public static void digLeft(int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
    }
    public static void digRight(int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][array.length -1 -i] = 1;
        }
    }

    public static void digCross(int[][] array){
        initZero(array);
        digLeft(array);
        digRight(array);
    }
    public static void main(String[] args) {
        int size = 0;
        System.out.print("введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.out.println("Введено не верное значение");
        }
        int[][] array = new int[size][size];

        initZero(array);
        printArray(array);
        System.out.println();

        initZero(array);
        digLeft(array);
        printArray(array);
        System.out.println();

        initZero(array);
        digRight(array);
        printArray(array);
        System.out.println();

        initZero(array);
        digCross(array);
        printArray(array);
    }
}
