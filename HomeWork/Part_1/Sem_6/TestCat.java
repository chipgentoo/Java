package HomeWork.Part_1.Sem_6;

public class TestCat {
    public static void main(String[] args) {
        Cats cat1 = new Cats();
        cat1.setName("Васька");
        cat1.setColor("Рыжий");
        cat1.setSpecies("Британец");
        System.out.println(cat1.getName());
        System.out.println(cat1.getColor());
        System.out.println(cat1.getSpecies());
        System.out.println(cat1);

        Cats cat2 = new Cats();
        cat2.setName("Васька");
        cat2.setColor("Рыжий");
        cat2.setSpecies("Британец");
        System.out.println(cat2.getName());
        System.out.println(cat2.getColor());
        System.out.println(cat2.getSpecies());
        System.out.println(cat2);

        System.out.println(cat1.equals(cat2));
    }

}
