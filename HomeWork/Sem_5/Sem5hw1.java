package Sem_5;

import java.util.*;

public class Sem5hw1 {
    public static boolean getValidTel(String phone){
        // формат +7 (123) 456-78-90, нехватка забивается нулями, лишние обрезаются
        return true;
    }
    public static void main(String[] args) {
        Map <String, ArrayList<String>> mapUser = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String inpString = scanner.next();
            String command = "";
            if ("ADD".equals(inpString)) { command = "ADD"; }
            if ("GET".equals(inpString)) { command = "GET"; }
            if ("REMOVE".equals(inpString)) { command = "REMOVE"; }
            if ("LIST".equals(inpString)) { command = "LIST"; }
            if ("EXIT".equals(inpString)) { command = "EXIT"; }
            switch (command){
                case ("ADD"):
                    //
                    break;
                case ("GET"):
                    //
                    break;
                case ("REMOVE"):
                    //
                    break;
                case ("LIST"):
                    //
                    break;
                case ("EXIT"):
                    System.out.println("Программа завершена!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод!");
            }
        }
    }
}
