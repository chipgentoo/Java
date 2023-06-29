package Part_2.Animals;

public class Pets {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Кот");
        System.out.println(cat1);
        cat1.toFeed(200f);
        System.out.println(cat1);
    }
}
