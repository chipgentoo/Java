package Attestation;

public class Toy {
    public String art;      // артикул
    public String name;     // название игрушки
    public int quantity;    // кол-во игрушек
    public short chance;    // шанс выпадения

    public Toy(String art, String name, int quantity, short chance) {
        this.art = art;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public String getArt() {
        return art;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public short getChance() {
        return chance;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setChance(short chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return "Игрушка: " +
                "\tартикул = " + art + "," +
                "\tНазвание = " + name + "," +
                "\tКол-во = " + quantity + "," +
                "\t%% выпадения = " + chance;
    }
}
