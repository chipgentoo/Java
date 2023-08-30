package Attestation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class RaffleToy {

    String[] arrChance = new String[100]; // заполняется согласно шанса выпадения
    List <Toy> toyList = new ArrayList<>();

    public boolean add(Toy toy){
        // проверка на заполненность %% выпадения (Не должна превышать 100%)
        short curSumChance = 0;
        for (Toy toys: toyList) {
            curSumChance += toys.getChance(); // считаем существуюшие
        }
        if ((curSumChance + toy.getChance()) > 100) {
            System.out.print("Общая сумма шансов выпадения превышает 100%\n");
            return false;
        }
        toyList.add(toy);
        return true;
    }

    public void showList(){
        for (Toy toy: toyList) {
            System.out.println(toy.toString());
        }
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
}
