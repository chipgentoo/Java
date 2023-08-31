package Attestation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public final class RaffleToy {

    String[] arrChance = new String[100]; // заполняется согласно шанса выпадения
    List <Toy> toyList = new ArrayList<>();

    public boolean add(Toy toy){
        // проверка на заполненность %% выпадения (Не должна превышать 100%)
        short curSumChance = 0;
        for (Toy toys: toyList) {
            curSumChance += toys.getChance(); // считаем существующие
        }
        if ((curSumChance + toy.getChance()) > 100) {
            System.out.print("Общая сумма шансов выпадения превышает 100%\n");
            return false;
        }
        toyList.add(toy);
        return true;
    }

    public void showList(){
        int sumQuantity = 0;
        int sumChance = 0;
        int sumToys = toyList.size();
        for (Toy toy: toyList) {
            System.out.println(toy.toString());
            sumChance += toy.getChance();
            sumQuantity += toy.getQuantity();
        }
        System.out.println("==========");
        System.out.println(
                "Видов игрушек: " + sumToys + ", Общее кол-во: " + sumQuantity + ", Общий шанс выпадения: " + sumChance
        );
    }

    public Toy getToyConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите артикул: >");
        String art = scanner.nextLine();
        System.out.print("Введите название: >");
        String name = scanner.nextLine();
        System.out.print("Введите кол-во: >");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите шанс выпадения ( < 100% ): >");
        short chance = Short.parseShort(scanner.nextLine());

        return new Toy(art, name, quantity, chance);
    }

    public void edit(String art){
        for (Toy toy:toyList) {
            if (Objects.equals(toy.getArt(), art)){
                short curChance = toy.getChance(); // запоминаем шанс
                Scanner scanner = new Scanner(System.in);
                try {
                    short newChance = Short.parseShort(scanner.nextLine()); // получили новый шанс
                    toy.setChance(newChance);
                    if (!checkChance()){ // < 100%
                        toy.setChance(curChance); // если не прокатило, возвращаем шанс назад.
                    }
                } catch (NumberFormatException e){
                    System.out.println("Не верное формат числа");
                }
            }
        }
    }

    private boolean checkChance(){
        short curSumChance = 0;
        for (Toy toy: toyList) {
            curSumChance += toy.getChance();
        }
        if ((curSumChance) > 100) {
            System.out.print("Общая сумма шансов выпадения превышает 100%\n");
            return false;
        }
        return true;
    }
}
