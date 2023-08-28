package HomeWork.Attestation;

import java.util.Scanner;

public class MainApp {

    public static String[] array_art = new String[100];
    public void start() {

        Toy toy = new Toy();

        System.out.println("Program started");
        if (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Комманды -> add, edit, del, list, exit");
            System.out.print("Введите команду >");
            String command = scanner.nextLine();
            switch (command){
                case "add":
                    toy.add();
                case "edit":
                case "del":
                case "list":
                    toy.list();
                case "exit":
                    System.exit(0);
            }
        }
    }
}
