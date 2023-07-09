package HomeWork.Part_2.D_FruitBox;

import java.util.ArrayList;
import java.util.List;

// FIXME: 06.07.2023 Добавить нужный дженерик.
// FIXME: 06.07.2023 Реализовать методы согласно заданию.
public class Box<Fruit> {
    private final List<Fruit> fruitList = new ArrayList<>();

    public Box() {}

    public void add(Fruit fruit){
        fruitList.add(fruit);
    }

    public int getWeight(){
        int sumWeight = 0;
        for (Fruit fruit : fruitList) {
            if (fruit instanceof Orange){
                sumWeight += ((Orange) fruit).getWeight();
            }
            if (fruit instanceof Apple){
                sumWeight += ((Apple) fruit).getWeight();
            }
        }
        return sumWeight;
    }
    
    public void moveTo(Box<? super Fruit> box ){
        box.fruitList.addAll(fruitList);
        this.fruitList.clear();
    }
}
