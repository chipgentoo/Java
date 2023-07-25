package HomeWork.Part_4.Sem_2;

import java.lang.reflect.Array;

/*
    Если необходимо, исправьте данный код:
    задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
    ///////////////////////////////////////////
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    ///////////////////////////////////////////
 */
public class Task2 {
    public static void main(String[] args) {
        // String[] intArray = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"}; // не компилится
        // int[] intArray = new int[]{1, 2, 3, 4, 5}; // длинна массива меньше 8
        int[] intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // добавлено для проверки.
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("На ноль делить нельзя: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){ // добавлено
            System.err.println("Выход за граница массива!");
        }
    }
}
