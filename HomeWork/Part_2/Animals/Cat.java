package Part_2.Animals;

public class Cat extends Animals{
    public Cat(String catName) {
        super.animalType = enumAnimalType.CAT;
        this.animalName = catName;
        super.animalVoice = "Мяу-Мяу";
        super.animalAge = super.getAnimalAge();
        super.volumeFeed = 0.1f;
        this.animalWeight = 0.1f; // котенок
    }
    @Override
    public void toFeed(float eatValue){
        super.eatVolume += volumeFeed;
        this.animalWeight = volumeFeed / 2;
        super.countFeeding += 1;
        super.animalSatiety = true;
        System.out.print("Животное поело");
    }
    @Override
    public String toString() {
        return  "Тип: " + animalType + ", " + super.toString();
    }
}
