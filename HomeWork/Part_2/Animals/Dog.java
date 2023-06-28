package HomeWork.Part_2.Animals;

public class Dog extends Animals{
    public Dog(String dogName) {
        this.animalType = enumAnimalType.DOG;
        this.animalName = dogName;
        this.animalVoice = "Гав-Гав";
        this.animalAge = super.getAnimalAge();
        this.animalWeight = 0.3f; // щенок
    }

    @Override
    public String toString() {
        return  "Тип: " + animalType + ", " + super.toString();
    }
}
