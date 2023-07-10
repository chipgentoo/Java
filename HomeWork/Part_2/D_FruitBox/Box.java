package HomeWork.Part_2.D_FruitBox;

import java.util.ArrayList;
import java.util.List;

// FIXME: 06.07.2023 Добавить нужный дженерик.
// FIXME: 06.07.2023 Реализовать методы согласно заданию.
public class Box<T extends Fruit> {
    private final List<Fruit> fruitList = new ArrayList<>();

    public Box() {
    }

    public void add(T fruit){
        fruitList.add(fruit);
    }

    public int getWeight(){
        int sumWeight = 0;
        for (Fruit fruit : fruitList) {
            sumWeight += fruit.getWeight();
        }
        return sumWeight;
    }
    
    public void moveTo(Box<? super T> box ){
        box.fruitList.addAll(fruitList);
        this.fruitList.clear();
    }
}
