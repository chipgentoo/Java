package HomeWork.Part_2.A_Animals;

import java.util.Scanner;

/**
 *  Абстрактный класс - Animals (Животные)
 *  После рождения животное начинает свой жизненный цикл. В Main.
 *  Периодически требуется его кормить.
 *  Вес, Голод, Усталость, Сон, Движение, Кол-во пищи, Наполненность миски.
 *  Если в миске еды больше чем съедаемое за раз, то цикл в автомате и кормить не нужно.
 *  После сна +0.25 дня.
 *  Потребление пищи за раз, начальный вес указываются в наследнике.
 */
public abstract class Animals {
    protected static int countAnimal = 0; // счетчик животных
    protected enum enumAnimalType{ CAT, DOG, HORSE }
    protected enumAnimalType animalType; // тип
    protected String animalName; // кличка
    protected float animalAge; // возраст
    protected float animalWeight; // вес
    protected String animalVoice; // голос


    // ========== ЕДА ==========
    protected float volumeFeed; // кол-во, съедаемое за раз
    protected int countFeeding; // кол-во кормлений
    protected float eatVolume;  // общее кол-во съеденной еды
    protected float leftoverFood; // Остаток еды в кормушке
    protected boolean animalSatiety; // Сытость
    protected boolean animalFatigue; // Усталость


    // ========== ДЕЙСТВИЯ ==========
    protected boolean animalMove; // Гуляет / Играет / Двигается
    protected boolean animalSleep; // Сон / Спать


    // ========== РЕАЛИЗАЦИЯ ==========
    protected float getAnimalAge() { return animalAge; } // default 0;
    protected int animalCountView; // кол-во осмотров животного / контроль роста

    protected Animals() {
        countAnimal += 1;
        this.animalAge = 0f;
        this.animalWeight = 0f;
        this.countFeeding = 0;
        this.eatVolume = 0f;
        this.animalMove = false;
        this.animalSleep= false;
        this.animalSatiety = true;
        this.animalFatigue = false;
        this.animalCountView = 0;
        this.leftoverFood = 0f;
    }
    protected void toMove(){ // Движение
        if (this.animalFatigue){ // если устали
            System.out.println(this.animalName + ": Устали");
            this.toFeed();  // поели
            this.toSleep(); // поспали
        } else {
            this.animalMove = true;     // Двигаемся
            System.out.println(this.animalName + ": Двигаемся");
            this.animalFatigue = true;  // Устали
        }
    }
    protected void toSleep(){ // Сон / Спать
        if (this.animalFatigue){// если устали
            this.animalSleep = true;    // уснули
            this.animalFatigue = false; // полны сил
            this.animalAge += 0.25f;    // подросли
            System.out.println(this.animalName + ": Поспали");
        }
        this.toFeed();
    }
    protected void toFeed(float Value){                 // Кормление
        this.leftoverFood += Value;                     // еды в кормушке
        // если в кормушке больше чем съедаемое за раз
        if (this.leftoverFood >= this.volumeFeed){
            this.countFeeding += 1;                     // кол-во кормлений +1
            this.eatVolume += volumeFeed;               // общее кол-во съеденной еды
            this.leftoverFood -= this.volumeFeed;       // кормушка - съедаемое за раз
            this.animalSatiety = true;                  // сытость
            this.animalWeight += this.volumeFeed / 2;   // вес + половина съеденной за раз еды
            System.out.println(this.animalName + ": Поели");
        } else {
            System.out.println(this.animalName + ": В кормушке мало еды");
            this.animalSatiety = false;
            this.toFeed();
        }
    }
    protected void toFeed(){ // кормление
        // если в миске больше съедаемого за раз
        if(this.leftoverFood > volumeFeed){
            this.toFeed(0f);
        } else {
            this.addEat();
        }
    }
    protected void addEat(){ // добавление еды в кормушку
        System.out.print("Добавьте еды в кормушку " + this.animalName + ": ");
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextFloat()){
                this.toFeed(scanner.nextFloat());
            }
        }
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
                "Сытость: " + animalSatiety + ", " +
                "Усталость: " + animalFatigue;
    }
}