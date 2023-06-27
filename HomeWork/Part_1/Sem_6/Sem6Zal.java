/**
 * Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 1000.
 */
package HomeWork.Part_1.Sem_6;

import java.util.*;

public class Sem6Zal {

    public static Integer[] getRandArray(){
        Random rand = new Random(); // создаем объект класса Random
        int length = 1000;
        Integer[] numbs = new Integer[length];
        for (int i = 0; i < length; i++) {
            numbs[i] = rand.nextInt(1001); // заполняем каждый элемент случайным числом от 0 до 1000
        }
        return numbs;
    }
    public static void main(String[] args) {
        Integer[] intArray = getRandArray();
        Set <Integer> intSet = new HashSet<>();
        Collections.addAll(intSet,intArray);
        //System.out.println(intSet);
        double percent = intSet.size() * 1.0 * 100 / intArray.length;
        System.out.println("Заполненность " + percent + "%");
    }
}
