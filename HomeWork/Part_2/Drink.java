package HomeWork.Part_2;

/**
 *  Абстрактный класс - Напиток
 */
public abstract class Drink {
    protected String name;
    protected int volume;
    
    /**
     * Конструктор
     * @param name Название напитка
     * @param volume Объём напитка
     */
    public Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
