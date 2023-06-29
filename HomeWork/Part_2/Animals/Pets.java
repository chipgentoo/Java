package Part_2.Animals;

public class Pets {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот");
        System.out.println(cat1);
        for (int i = 0; i < 6; i++) {
            cat1.toFeed();
            System.out.println(cat1);
        }
    }
}
