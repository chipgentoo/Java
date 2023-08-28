<<<<<<< HEAD
package Attestation;

public class Toy {
    public int art;     // артикул
    public String name; // название игрушки
    public int quantity;// кол-во игрушек
    public int chance;  // шанс выпадения

    public Toy(int art, String name, int quantity, int chance) {
        this.art = art;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
=======
package HomeWork.Attestation;

import java.util.Scanner;

public class Toy {
    String art;         // Идентификатор (артикул)
    String name;        // Наименование игрушки
    int quantity;       // Кол-во игрушек, учавствующих в розыгрыше
    short frequency;    // Частота выпадения. Должна быть всегда <= 100

    static String[] array_art = new String[100]; // используется для сортировки art согласно %%
    static int current_percent = 0; // max = 100;

    public void add(){
        Scanner scanner = new Scanner(System.in);
        // ==========================================
        System.out.print("Введите артикул игрушки >");
        art = scanner.nextLine();
        System.out.print("\n");
        // ==========================================
        System.out.print("Введите наименование игрушки >");
        name = scanner.nextLine();
        System.out.print("\n");
        // ==========================================
        System.out.print("Введите кол-во игрушек >");
        try {
            quantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println(e);
        }
        System.out.print("\n");
        // ==========================================
        System.out.print("Введите частоту выпадения в %% >");
        try {
            quantity = Short.parseShort(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.print(e);
        }

        System.out.print("\n");

        this.art = art;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public void list() {

>>>>>>> 05ef3f6 (ShopToy)
    }
}
