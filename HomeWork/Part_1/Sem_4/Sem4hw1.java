/**
 * Задача: Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и “запоминает” строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
 * 4. Если введено exit, то программа завершается
 * > - ввод в консоль (stdin),
 * < - вывод на консоль (stdout)
 * > java
 * > python
 * > c#
 * > print
 * < [c#, python, java]
 * > revert
 * > print
 * < [python, java]
 * > revert
 * > revert
 * > print
 * < []
 * > revert -> throw new NoSuchElementException
 */
package HomeWork.Part_1.Sem_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Sem4hw1 {
    public static void main(String[] args) {
        LinkedList <String> storage = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String command = scanner.next();
            if ("exit".equals(command)) {
                System.out.println("Программа завершена.");
                break;
            }

            if ("revert".equals(command)) {
                if (!storage.isEmpty()){
                    storage.removeFirst();
                } else {
                    System.out.println("Нечего удалять!");
                }
                continue;
            }

            if ("print".equals(command)){
                System.out.println(storage);
            } else {
                storage.addFirst(command);
            }
        }
    }
}
