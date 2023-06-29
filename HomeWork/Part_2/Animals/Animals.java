package Part_2.Animals;

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
    // ========== ЕДА ==========
    protected float volumeFeed; // кол-во, съедаемое за раз
    protected int countFeeding; // кол-во кормлений
    protected float eatVolume;  // кол-во съеденной еды
    protected float leftoverFood; // Остаток еды в кормушке
    // ==========  ==========
    protected boolean animalMove; // Гуляет / Играет / Двигается
    protected boolean animalSleep; // Сон / Спать
    protected boolean animalSatiety; // Сытость


    // ========== РЕАЛИЗАЦИЯ ==========
    protected float getAnimalAge() { return animalAge; } // default 0;
    protected int animalCountView; // кол-во осмотров животного / контроль роста

    public Animals() {
        this.animalAge = 0f;
        this.animalWeight = 0f;
        this.countFeeding = 0;
        this.eatVolume = 0f;
        this.animalMove = false;
        this.animalSleep= false;
        this.animalSatiety = false;
        this.animalCountView = 0;
        this.leftoverFood = 0f;
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
    protected void toFeed(float eatValue){
        this.eatVolume += volumeFeed;
        this.animalWeight = volumeFeed / 2;
        this.countFeeding += 1;
        this.animalSatiety = true;
        System.out.println("Животное поело");
    }
}