package HomeWork.Part_2.A_Animals;

import java.util.ArrayList;

public class Pets {
    public static void main(String[] args) {
        ArrayList<Animals> petList = new ArrayList<>();
        int countPet = 1; // кол-во животных каждого вида
        int countLife = 10; //кол-во жизненных циклов
        for (int i = 0; i < countPet; i++) {
            petList.add(new Cat());
            petList.add(new Dog());
            petList.add(new Horse());
        }
        for (int i = 0; i < countLife; i++) {
            System.out.println("============================================");
            for (Animals animals : petList) { System.out.println(animals); }
            for (Animals animals : petList) { animals.toMove(); animals.toSleep();}
            for (Animals animals : petList) { System.out.println(animals); }
        }
    }
}

