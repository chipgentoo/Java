package Attestation;

public class Toy {
    public int art;     // артикул
    public String name; // название игрушки
    public int quantity;// кол-во игрушек
    public int chance;  // шанс выпадения

    public Toy(int art, String name, int quantity, int chance) {
        this.art = art;
        this.name = name;
        this.quantity = quantity;
        this.chance = chance;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }
}
