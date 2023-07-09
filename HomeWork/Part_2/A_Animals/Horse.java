package HomeWork.Part_2.A_Animals;

public class Horse extends Animals {
    public Horse(){
        super.animalType = enumAnimalType.HORSE;
        super.animalName = "Лошадка_" + countAnimal;
        super.animalVoice = "Иго-го";
        super.animalAge = super.getAnimalAge();
        super.volumeFeed = 1.2f;    // потребление еды за раз
        super.animalWeight = 1.2f;  // начальный вес
    }
    @Override
    public String toString() {
        return  "Тип: " + animalType + ", " + super.toString();
    }

}
