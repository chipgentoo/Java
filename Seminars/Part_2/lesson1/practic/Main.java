package lesson1.practic;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new FruitVendingMachine();
        vendingMachine.addFruit(new Banana(1L, 12, "Yellow"));
        vendingMachine.addFruit(new Blueberry(2L, 546, "Blue"));
        vendingMachine.addFruit(new Apple(3L, 23, "Red"));

        System.out.println(vendingMachine.getFruit(2L));

        Fruit fruit = vendingMachine.getFruit(2L);

        System.out.println(vendingMachine);
    }
}
