package Part_2.D_FruitBox;

public abstract class Fruit {
    private final int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}