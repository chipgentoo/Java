package lesson1.practic;

import lesson1.OurList;

import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine {
    private final List<Fruit> fruitList;

    public VendingMachine() {
        this.fruitList = new OurList<>();
    }

    public void addFruit(Fruit fruit) {
        fruitList.add(fruit);
    }

    public Fruit getFruit(Long id) {
        for (Fruit fruit : fruitList) {
            if (fruit.getId().equals(id)) {
                return fruit;
            }
        }
        return null;
    }

    public List<Fruit> getFruitList() {
        return fruitList;
    }

    @Override
    public String toString() {
        return String.format("Fruits: %s", fruitList);
    }
}
