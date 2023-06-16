/**
 * Задание
 * Пусть дан произвольный список целых чисел.
 * 1) Найти максимальное значение
 * 2) Найти минимальное значение
 * 3) Найти среднее значение
 * 4) Нужно удалить из него чётные числа
 */
package Sem_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sem3hw1 {
    // генерируем рандомный список целых чисел
    public static List<Integer> listGen(int length, int min, int max){
        Random rnd = new Random();
        int lengthList = rnd.nextInt(length); // длинна списка до length
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < lengthList; i++) {
            integerList.add(rnd.nextInt((max - min) + 1) + min);
        }
        return integerList;
    }

    public static int getMin(List<Integer> integerList){
        int min = integerList.get(0); // принимаем минимум за 0-й элемент списка
        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i) < min) {
                min = integerList.get(i);
            }
        }
        return min;
    }
    public static int getMax(List<Integer> integerList){
        int max = integerList.get(0); // принимаем максимум за 0-й элемент списка
        for (int i = 1; i < integerList.size(); i++) {
            if (integerList.get(i) > max) {
                max = integerList.get(i);
            }
        }
        return max;
    }
    public static double averageList(List<Integer> integerList){
        double sum = 0;
        for (Integer integer : integerList) {
            sum += integer;
        }
        return sum / integerList.size(); // среднее арифметическое (сумма / кол-во)
    }

    public static void removeEvenValue(List<Integer> integerList){
        // По скольку при удалении элемента из списка происходит смещение к началу,
        // удаление по всему списку удобнее производить с конца списка.
        // (Надеюсь правильно понял работу списков!!!)
        for (int i = integerList.size()-1; i >= 0; i--) {
            if (integerList.get(i) % 2 == 0){
                integerList.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> integerList = listGen(10,0,99);
        System.out.println("Исходный список" + integerList);
        System.out.println("Mini value: " + getMin(integerList));
        System.out.println("Maxi value: " + getMax(integerList));
        System.out.println("Aver value: " + averageList(integerList));
        removeEvenValue(integerList);
        System.out.println("Удалены  чётные" + integerList);
    }
}
