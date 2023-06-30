package Part_2.Animals;

public class Cat extends Animals{
    public Cat() {
        super.animalType = enumAnimalType.CAT;
        super.animalName = "Котейка_" + countAnimal;
        super.animalVoice = "Мяу-Мяу";
        super.animalAge = super.getAnimalAge();
        super.volumeFeed = 0.1f;    // потребление еды за раз
        super.animalWeight = 0.1f;  // начальный вес
    }
    @Override
    public String toString() {
        return  "Тип: " + animalType + ", " + super.toString();
    }
}
