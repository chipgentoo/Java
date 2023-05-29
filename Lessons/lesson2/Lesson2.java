package ru.gb.lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Lesson2 {

    public static void main(String[] args) {
        // .jar

        // JDK Java Development Kit = JRE + javac
        // JRE Java Runtime Environment
        // javac - программа-компилятор

        // JRE = JVM + Стандартная библиотека
        // Java Virtual Machine

//        sortDemo();
        int[] data = IntStream.rangeClosed(1, 10)
                .filter(it -> it != 5)
                .toArray();
        System.out.println(binarySearch(data, 1)); // 0
        System.out.println(binarySearch(data, 2)); // 1
        System.out.println(binarySearch(data, 3)); // 2
        System.out.println(binarySearch(data, 4));
        System.out.println(binarySearch(data, 5)); // -1
        System.out.println(binarySearch(data, 6));
        System.out.println(binarySearch(data, 7));
        System.out.println(binarySearch(data, 8));
        System.out.println(binarySearch(data, 9));
        System.out.println(binarySearch(data, 10));
        System.out.println(binarySearch(data, 11)); // -1

        System.out.println(Arrays.binarySearch(data, 5));
    }

    /**
     *  Найти индекс элемента, который равен target. Если такого нет - вернуть -1
     */
    static int binarySearch(int[] array, int target) {
        return binarySearchRecursive(array, target, 0, array.length - 1);
    }

    // return left if array[left] == target else -1 -- python
    static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (left == right) {
            return array[left] == target ? left : -1; // Тернарный оператор
//            if (array[left] == target) {
//                return left;
//            } else {
//                return -1;
//            }
        }

        int middleIndex = (left + right) /  2;
        int middleElement = array[middleIndex];
        if (middleElement == target) {
            return middleIndex;
        } else if (middleElement < target) {
            // искомый элемент находится правее чем middle
            return binarySearchRecursive(array, target, middleIndex + 1, right);
        } else {
            // искомый элемент находится левее чем middle
            return binarySearchRecursive(array, target, left, middleIndex - 1);
        }
    }


    private static void sortDemo() {
        int[] ints = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100))
                .limit(20)
                .toArray();


        quickSort(ints);
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    static void quickSort(int[] array) {
        // 1. Выбираем опорный элемент (любой элемент массива).
        // От способа выбора элемента зависит модификация алгоритма
        // (Можно взять первый, можно взять серидинный, можно взять рандомный (random quick sort),
        //     можно выполнить подготовительные работы и выбрать опорный элемент)
        // 2.1. Все элементы, которые МЕНЬШЕ чем опорный, помещаются слева от него
        // 2.2. Все элементы, которые БОЛЬШЕ или РАВНЫ помещаются справа от него
        // 3. Сортируем отдельно левую (слева от опорного) и правую части
        // 3 5 *1 7 5 2 8 1
        // 3 5 *1 7 5 2 8 1
        // [1] 3 5 7 5 2 8 1 -> (), [1, 7]
        // [1] 3 5 7 *5 2 8 1
        // [1] 2 1 3 *5 7 5 8 -> [1, 3], [5, 7]
        quickSortRecursive(array, 0, array.length - 1);

        // 1 1 1 1 10 [5] 7 7 3 7 7 7
    }

    static void quickSortRecursive(int[] array, int left, int right) {
        if (left >= right) {
            // Дошли до неделимого диапазона
            return;
        }

        int baseIndex = (left + right) / 2; // индекс опорного элемента
        int base = array[baseIndex]; // опрный элемент

        // Распределяем элементы: все, что меньше опорного влево, все остальное вправо.
        int i = left;
        int j = right;
        while (i <= j) {
            while (array[i] < base) {
                i++;
            }

            while (array[j] > base) {
                j--;
            }

            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        // i == j, все что меньше опорного левее i-го

        // Рекурсивно сортируем левую часть
        if (left < j) {
            quickSortRecursive(array, left, j);
        }
        // Рекурсивно сортируем правую часть
        if (i < right) {
            quickSortRecursive(array, i, right);
        }
    }


}
