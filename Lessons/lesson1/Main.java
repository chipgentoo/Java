package ru.gb.lesson1;

public class Main {

    public static void main(String[] args) {
        // O(n), O(n^2), O(n^3), O(log(n))

        // o(n^1000) < o(2^n)
        // o(n!) > o(2^n)

        System.out.println(fibonacciFast(0));
        System.out.println(fibonacciFast(1));
        System.out.println(fibonacciFast(5));
        System.out.println(fibonacciFast(6));
        System.out.println(fibonacciFast(7));
    }

    private static int findMax(int[] array) {
        int max = array[0];
        // O(n)
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 10 -> 10
        // 100 -> 100
        // 10_000 -> 10_000
        return max;
    }

    private static int sumEven(int[] array) {
        int sum = 0;
        // O(n / 2) ~ O(n)
        for (int i = 0; i < array.length; i = i + 2) {
            sum += array[i];
        }
        // 10 -> 5
        // 100 -> 50
        // 10_000 -> 5_000
        return sum;
    }

    private static int sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    private static int logarithm(int[] array) {
        // Посчитать сумму элементов с индексами 0, 1, 2, 4, 8, 16, 32, ...
        // (индексы которых являются степенью двойки)


        int sum = array[0];
        for (int i = 1; i < array.length; i = i * 2) {
            sum += array[i];
        }
        // 100 -> 8
        // 1000 -> 11

        return sum;
    }

    private static int fibonacci(int n) {
        // 0 1 1 2 3 5 8 13 21 34 ...
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // f(10) = f(9) + f(8) = (f(8) + f(7)) + (f(7) + f(6))
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static int fibonacciFast(int n) {
        if (n == 0) {
            return 0;
        }

        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }



}