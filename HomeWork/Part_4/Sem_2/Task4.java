package HomeWork.Part_4.Sem_2;

import java.util.Scanner;

/*
    Разработайте программу, которая выбросит Exception,
    когда пользователь вводит пустую строку.
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введена строка: " + readConsole());
    }

    private static String readConsole() {
        System.out.print("Введите строку символов: ");
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        if (result.trim() == "") {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        return result.trim();
    }
}
