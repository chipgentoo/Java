package HomeWork.Part_2.Animals;

public class Cat extends Animals{
    public Cat(String catName) {
        this.animalType = enumAnimalType.CAT;
        this.animalName = catName;
        this.animalVoice = "Мяу-Мяу";
        this.animalAge = super.getAnimalAge();
        this.animalWeight = 0.1f; // котенок
    }

    @Override
    public String toString() {
        return  "Тип: " + animalType + ", " + super.toString();
    }
}
