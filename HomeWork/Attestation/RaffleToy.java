package HomeWork.Attestation;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public final class RaffleToy {

    String[] arrChance = new String[100]; // заполняется согласно шанса выпадения
    List <Toy> toyList = new ArrayList<>();

    public boolean add(Toy toy){
        // проверка на заполненность %% выпадения (Не должна превышать 100%)
        short curSumChance = 0;
        for (Toy toys: toyList) {
            curSumChance += toys.getChance(); // считаем существующие
        }
        if ((curSumChance + toy.getChance()) > 100) {
            System.out.print("Общая сумма шансов выпадения превышает 100%\n");
            System.out.print("Игрушка НЕ добавлена");
            return false;
        }
        toyList.add(toy);
        return true;
    }

    public void showList(){
        int sumQuantity = 0;
        int sumChance = 0;
        int sumToys = toyList.size();
        for (Toy toy: toyList) {
            System.out.println(toy.toString());
            sumChance += toy.getChance();
            sumQuantity += toy.getQuantity();
        }
        System.out.println("==========");
        System.out.println(
                "Видов игрушек: " + sumToys + ", Общее кол-во: " + sumQuantity + ", Общий шанс выпадения: " + sumChance
        );
    }

    public Toy getToyConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите артикул: >");
        String art = scanner.nextLine();
        System.out.print("Введите название: >");
        String name = scanner.nextLine();
        System.out.print("Введите кол-во: >");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Введите шанс выпадения ( целое < 100% ): >");
        short chance = Short.parseShort(scanner.nextLine());

        return new Toy(art, name, quantity, chance);
    }

    public void edit(String art){
        for (Toy toy:toyList) {
            if (Objects.equals(toy.getArt(), art)){
                short curChance = toy.getChance(); // запоминаем шанс
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите новый шанс выпадения ( целое < 100% ): >");
                try {
                    short newChance = Short.parseShort(scanner.nextLine()); // получили новый шанс
                    if (curChance < newChance){ // Если новый шанс больше старого делаем проверку до 100
                        toy.setChance((short) 0); // обнуляем шанс
                        if (checkSumChance(newChance)){ // если > 100
                            toy.setChance(newChance); // возвращаем старый шанс
                        } else {
                            toy.setChance(curChance);
                        }
                    } else {
                        toy.setChance(newChance); // новый меньше старого. Проверку не делаем.
                    }
                } catch (NumberFormatException e){
                    System.out.println("Не верное формат числа");
                }
            }
        }
    }

    private boolean checkSumChance(short chance){
        short curSumChance = 0;
        for (Toy toy: toyList) {
            curSumChance += toy.getChance();
        }
        curSumChance += chance;
        if ((curSumChance) > 100) {
            System.out.print("Общая сумма шансов выпадения превышает 100%\n");
            return false;
        }
        return true;
    }

    public void delete(String art) {
        for (int i = 0; i < toyList.size(); i++) {
            if(Objects.equals(toyList.get(i).getArt(), art)){
                try {
                    toyList.remove(i);
                } catch (UnsupportedOperationException e){
                    System.out.println(e);
                }
            }
        }
    }

    public void winlot() {
        String art;
        fillArrayToys();
        mixArrayToys();
        art = raffleToy();
        saveToFile(art);
    }

    private void saveToFile(String art){
        String pathFile = "RaffleToys.txt";
        System.out.println("Пишем в файл: " + pathFile);
        Date date = new Date();
        String saveString = "";
        for (Toy toy:toyList) {
            if (toy.getArt()==art){
                saveString = date + " -> " + toy.toShortString();
            }
        }

        try(FileWriter toyFW = new FileWriter(pathFile,true)){
            toyFW.write(saveString);
            toyFW.flush();
        } catch (IOException e){
            System.out.println(e);
        }
    }

    private void fillArrayToys(){ // последовательное заполнение массива артикулами
        short iter = 0;
        for (Toy toy: toyList) {
            for (int i = iter; i < iter + toy.getChance() ; i++) {
                arrChance[i] = toy.getArt();
            }
            iter += toy.getChance();
        }
    }

    private void mixArrayToys(){ // перемешивание массива артикулов
        String tmpArt;
        int sumQuantity = 0;
        for (Toy toy:toyList) {
            sumQuantity += toy.getQuantity();
        }
        for (int i = 0; i < sumQuantity; i++) { // Просто цикл для перемешивания. Кол-во итераций зависит от общего кол-ва игрушек
            int firstIndex = getRandomNumber();
            int secondIndex = getRandomNumber();
            // рандомно меняем местами
            tmpArt = arrChance[firstIndex];
            arrChance[firstIndex] = arrChance[secondIndex];
            arrChance[secondIndex] = tmpArt;
        }
    }

    private String raffleToy(){
        int index = getRandomNumber();
        System.out.print("Вы выиграли приз: ");
        for (Toy toy:toyList) {
            if (Objects.equals(toy.getArt(), arrChance[index])){
                System.out.println(toy.getName());
                toy.setQuantity(toy.getQuantity()-1); // уменьшаем кол-во конкретной игрушки на -1
            }
        }
        return arrChance[index];
    }
    public int getRandomNumber() {
        int min = 0; int max = 99;
        return (int) ((Math.random() * (max - min)) + min);
    }
}
