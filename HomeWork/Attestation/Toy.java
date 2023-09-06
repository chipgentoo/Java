package HomeWork.Attestation;

public class Toy {
    private final String art;      // артикул
    private final String name;     // название игрушки
    private int quantity;    // кол-во игрушек
    private short chance;    // шанс выпадения

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
    public String toShortString(){
        return "Игрушка: " +
                "\tартикул = " + art + "," +
                "\tНазвание = " + name + "\n";
    }
}
