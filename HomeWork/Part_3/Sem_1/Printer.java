//package HomeWork.Part_3.Sem_1;
//
//    /*
//    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
//    Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
//    Метод divisionByZero - Деление на 0
//    Метод numberFormatException - Ошибка преобразования строки в число
//    Важно: они не должны принимать никаких аргументов
//    */
//
//class Answer {
//    public static void arrayOutOfBoundsException() {
//        // Напишите свое решение ниже
//        int[] arrIntNumber = new int[]{1, 2, 3, 4, 5};
//        int result;
//        for (int i = 0; i < 10; i++) {
//            result = arrIntNumber[i];
//        }
//    }
//
//    public static void divisionByZero() {
//        // Напишите свое решение ниже
//        int[] arrIntNumber1 = new int[]{1, 3, 5, 7, 9};
//        int[] arrIntNumber2 = new int[]{2, 4, 6, 8, 0};
//        double result = 0;
//        for (int i = 0; i < arrIntNumber1.length; i++) {
//            result = arrIntNumber1[i] / arrIntNumber2[i];
//        }
//    }
//
//    public static void numberFormatException() {
//        // Напишите свое решение ниже
//        String strNumber = "12345.6789";
//        int intNumber = Integer.parseInt(strNumber);
//    }
//}
//
//public class Printer {
//    public static void main(String[] args) {
//        Answer ans = new Answer();
//        try {
//            ans.arrayOutOfBoundsException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за пределы массива");
//        }
//
//        try {
//            ans.divisionByZero();
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль");
//        }
//
//        try {
//            ans.numberFormatException();
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка преобразования строки в число");
//        }
//    }
//}