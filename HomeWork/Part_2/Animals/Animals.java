package HomeWork.Part_2.Animals;

/**
 *  Абстрактный класс - Animals (Животные)
 */
public abstract class Animals {
    protected enum enumAnimalType{ CAT }
    protected enumAnimalType animalType; // тип животного

    // ========== ИМЯ / КЛИЧКА ==========
    protected String animalName;

    // ========== ВОЗРАСТ ==========
    protected float animalAge;
    protected float getAnimalAge() { return animalAge; } // default 0;

    // ========== ВЕС ==========
    protected float animalWeight;

    // ========== ГОЛОС ==========
    protected String animalVoice;

    // ========== ПРОЧЕЕ ==========
    protected int countFeeding;  // кол-во кормлений
    protected Double eatVolume; // кол-во съеденной еды
    protected boolean animalMove; // Гуляет / Играет / Двигается
    protected boolean animalSleep; // Сон / Спать
    protected boolean animalSatiety; // Сытость


    protected int animalCountView; // кол-во осмотров животного / контроль роста
    public Animals() {
        this.animalAge = 0F;
        this.animalWeight = 0F;
        this.countFeeding = 0;
        this.eatVolume = 0D;
        this.animalMove = false;
        this.animalSleep= false;
        this.animalSatiety = false;
        this.animalCountView = 0;
    }

    @Override
    public String toString() {
        animalCountView += 1; // контроль роста
        return  "Имя: " + animalName + ", " +
                "Звук: " + animalVoice + ", " +
                "Возраст: " + animalAge + " дней, " +
                "Вес: " + animalWeight + " кг, " +
                "Кол-во кормлений: " + countFeeding + ", " +
                "Съедено еды: " + eatVolume + ", " +
                "Сытость: " + animalSatiety;
    }
}