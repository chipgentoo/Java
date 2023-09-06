package HomeWork.Part_1.Sem_6;

import java.util.Objects;
import java.util.Random;

public class NoteBooks {
    private final String typeNoteBook;
    public String getTypeNoteBook() {
        return typeNoteBook;
    }
    private final String manufacturer;
    public String getManufacturer() {
        return manufacturer;
    }
    private final String cpu;
    public String getCpu() {
        return cpu;
    }
    private final String ram;
    public String getRam() {
        return ram;
    }
    private final String typeStorage;
    public String getTypeStorage() {
        return typeStorage;
    }
    private final String sizeStorage;
    public String getSizeStorage() {
        return sizeStorage;
    }
    private final String videoCard;
    public String getVideoCard() {
        return videoCard;
    }
    private final String color;

    public String getColor() {
        return color;
    }
    private enum enTypeNotebook{
        Game("GameBook"), Notebook("NoteBook");
        private final String value;
        private static final Random rnd = new Random();
        private static enTypeNotebook rndTypeNotebook(){
            enTypeNotebook[] typeNotebook = values();
            return typeNotebook[rnd.nextInt(typeNotebook.length)];
        }
        enTypeNotebook(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    private enum enManufacturer {
        ASUS("ASUS"), ACER("ACER"), DELL("DELL"), DEPO("DEPO");
        private final String value;
        private static final Random rnd = new Random();
        private static enManufacturer rndManufacturer() {
            enManufacturer[] rndManufacturer = values();
            return rndManufacturer[rnd.nextInt(rndManufacturer.length)];
        }
        enManufacturer(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    private enum enCPU {
        AMD("AMD"), Intel("Intel"), ATOM("ATOM"), APPLE("APPLE");
        private final String value;
        private static final Random rnd = new Random();
        private static enCPU rndCPU() {
            enCPU[] rndCPU = values();
            return rndCPU[rnd.nextInt(rndCPU.length)];
        }
        enCPU(String value) { this.value = value; }
        public String getValue() { return value; }
    }
    private enum enRAM {
        R4GB("4GB"), R8GB("8GB") ,R16GB("16GB"), R32GB("32GB");
        private final String value;
        private static final Random rnd = new Random();
        private static enRAM rndRAM() {
            enRAM[] rndRAM = values();
            return rndRAM[rnd.nextInt(rndRAM.length)];
        }
        enRAM(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    private enum enTypeStorage {
        SSD("SSD"), HDD("HDD");
        private final String value;
        private static final Random rnd = new Random();
        private static enTypeStorage rndTypeStorage() {
            enTypeStorage[] rndTypeStorage = values();
            return rndTypeStorage[rnd.nextInt(rndTypeStorage.length)];
        }
        enTypeStorage(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    private enum enSizeStorage {
        SS512G("512GB"), SS1T("1TB"), SS2T("2TB"), SS4T("4TB");
        private final String value;
        private static final Random rnd = new Random();
        private static enSizeStorage rndSizeStorage() {
            enSizeStorage[] rndSizeStorage = values();
            return rndSizeStorage[rnd.nextInt(rndSizeStorage.length)];
        }
        enSizeStorage(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    private enum enVideoCard{
        ATI("ATI"), INTEL("Intel"), NVIDIA("NVIDIA");
        private final String value;
        private static final Random rnd = new Random();
        private static enVideoCard rndVideoCard(){
            enVideoCard[] rndVideoCard = values();
            return rndVideoCard[rnd.nextInt(rndVideoCard.length)];
        }
        enVideoCard(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    private enum enColor {
        BLACK("BLACK"), WHITE("WHITE"), SILVER("SILVER"), GOLD("GOLD");
        private final String value;
        private static final Random rnd = new Random();
        private static enColor rndColor() {
            enColor[] rndColor = values();
            return rndColor[rnd.nextInt(rndColor.length)];
        }
        enColor(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBooks noteBooks = (NoteBooks) o;
        return Objects.equals(typeNoteBook, noteBooks.typeNoteBook) &&
                Objects.equals(cpu, noteBooks.cpu) &&
                Objects.equals(ram, noteBooks.ram) &&
                Objects.equals(typeStorage, noteBooks.typeStorage) &&
                Objects.equals(sizeStorage, noteBooks.sizeStorage) &&
                Objects.equals(videoCard, noteBooks.videoCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeNoteBook, cpu, ram, typeStorage, sizeStorage, videoCard);
    }
    @Override
    public String toString() {
        return "{" +
                " TYPE='" + typeNoteBook + '\'' +
                " MANUFACTURER='" + manufacturer + '\'' +
                " CPU='" + cpu + '\'' +
                " RAM='" + ram + '\'' +
                " STORAGE='" + typeStorage + '\'' +
                " SSTORAGE='"+ sizeStorage+ '\'' +
                " VIDEO='" + videoCard + '\'' +
                " COLOR='" + color + '\'' +
                " }";
    }
    public NoteBooks(){
        manufacturer = enManufacturer.rndManufacturer().getValue();
        typeNoteBook = enTypeNotebook.rndTypeNotebook().getValue();
        cpu = enCPU.rndCPU().getValue();
        ram = enRAM.rndRAM().getValue();
        typeStorage = enTypeStorage.rndTypeStorage().getValue();
        sizeStorage = enSizeStorage.rndSizeStorage().getValue();
        videoCard = enVideoCard.rndVideoCard().getValue();
        color = enColor.rndColor().getValue();
    }
}
