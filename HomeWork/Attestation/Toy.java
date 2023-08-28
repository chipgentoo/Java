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

    }
}
