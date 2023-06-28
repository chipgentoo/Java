package HomeWork.Part_2.Animals;

/**
 *  Абстрактный класс - Animals (Животные)
 */
public abstract class Animals {
    protected enum enumAnimalType{ CAT, DOG }
    protected enumAnimalType animalType; // тип животного
    protected String animalName;
    protected float animalAge;
    protected float animalWeight;
    protected String animalVoice;
    protected int countFeeding;  // кол-во кормлений
    protected Double eatVolume; // кол-во съеденной еды
    protected boolean animalMove; // Гуляет / Играет / Двигается
    protected boolean animalSleep; // Сон / Спать
    protected boolean animalSatiety; // Сытость


    // ========== РЕАЛИЗАЦИЯ ==========
    protected float getAnimalAge() { return animalAge; } // default 0;
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