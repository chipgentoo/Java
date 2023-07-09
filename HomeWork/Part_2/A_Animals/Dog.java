package HomeWork.Part_2.A_Animals;

public class Dog extends Animals{
    public Dog() {
        super.animalType = enumAnimalType.DOG;
        super.animalName = "Щенок_" + countAnimal;
        super.animalVoice = "Тяф-Тяф";
        super.animalAge = super.getAnimalAge();
        super.volumeFeed = 0.2f;    // потребление еды за раз
        super.animalWeight = 0.2f;  // начальный вес
    }
    @Override
    public String toString() {
        return  "Тип: " + animalType + ", " + super.toString();
    }
}
