package HomeWork.Part_2.F_Work6;

import HomeWork.Part_2.F_Work6.work1.Rectangle;
import HomeWork.Part_2.F_Work6.work1.Square;
import HomeWork.Part_2.F_Work6.work2.AccountReportGenerator;
import HomeWork.Part_2.F_Work6.work2.DocumentReportGenerator;
import HomeWork.Part_2.F_Work6.work3.Greeter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Rectangle rectangle = new Rectangle();

        System.out.println("\nПрямоугольник 5 х 7");
        rectangle.setHeight(5);
        rectangle.setWidth(7);
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        System.out.println("\nКвадрат 5 х 7");
        Square square = new Square();
        square.setHeight(5);
        square.setWidth(7); // Вне зависимости от выбранного метода устанавливаются последние переданные данные.
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());

        System.out.println("===== AccountReportGenerator =====");

        AccountReportGenerator accountReportGenerator = new AccountReportGenerator();
        System.out.println(accountReportGenerator.generateJson());

        System.out.println("===== DocumentReportGenerator =====");

        DocumentReportGenerator documentReportGenerator = new DocumentReportGenerator();
        System.out.println(documentReportGenerator.generateXml());
        System.out.println(documentReportGenerator.generateJson());

        System.out.println("===== Greeter =====");

        Greeter greeter = new Greeter();

        greeter.setFormality("formal");
        System.out.println(greeter.greet());

        greeter.setFormality("casual");
        System.out.println(greeter.greet());
    }
}