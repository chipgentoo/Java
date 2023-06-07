package Seminars.Sem_1;

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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void initZero(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
    }
    public static void diagLeft(int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
    }
    public static void diagRight(int[][] array){
        for (int i = 0; i < array.length; i++) {
            array[i][array.length -1 -i] = 1;
        }
    }

    public static void diagCross(int[][] array){
        initZero(array);
        diagLeft(array);
        diagRight(array);
    }
    public static void main(String[] args) {
        int size = 0;
        System.out.print("введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner != null && scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.out.println("Введено не верное значение");
        }
        int[][] array = new int[size][size];

        initZero(array);
        printArray(array);
        System.out.println();

        initZero(array);
        diagLeft(array);
        printArray(array);
        System.out.println();

        initZero(array);
        diagRight(array);
        printArray(array);
        System.out.println();

        initZero(array);
        diagCross(array);
        printArray(array);
    }
}
