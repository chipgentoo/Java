package HomeWork.Part_4.Sem_2;

import java.util.Scanner;

/*
    Реализуйте метод, который запрашивает у пользователя
    ввод дробного числа (типа float), и возвращает введенное значение.
    Ввод текста вместо числа не должно приводить к падению приложения,
    вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        while (true) {
            if (floatReader() != null) System.exit(0);
        }
    }

    private static Float floatReader(){
        System.out.println("Введите число типа Float: ");
        Scanner scanner = new Scanner(System.in);
        Float result = null;
        try {
            result = Float.parseFloat(scanner.nextLine());
            System.out.println("Введено число: " + result);
        } catch (NumberFormatException e){
                System.err.println("Ошибка: требуется число типа float!");
        }
        return result;
    }
}
