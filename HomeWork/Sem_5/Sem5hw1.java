/**
 * Реализовать консольное приложение - телефонный справочник.
 * У одной фамилии может быть несколько номеров.
 * Пользователь может вводить команды:
 * 1: ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
 * 2: GET Ivanov - получить список всех номеров по фамилии
 * 3: REMOVE Ivanov - удалить все номера по фамилии
 * 4: LIST - Посмотреть все записи
 * 5: EXIT - Завершить программу

 * Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом.

 * Пример взаимодействия (=> - это вывод на консоль):
 * ADD Ivanov 8 800 555 35 35
 * ADD Ivanov 8 800 100 10 10
 * GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
 * ADD Petrov 8 555 12 34
 * LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
 * REMOVE Ivanov
 * LIST => Petrov = [8 555 12 34]
 * GET NoName => Не найдена запись с фамилией "NoName"
 * REMOVE NoName => Не найдена запись с фамилией "NoName"3
 */
package HomeWork.Sem_5;

import java.util.*;

public class Sem5hw1 {
    public static void main(String[] args) {
        HashMap <String, ArrayList<String>> mapUser = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ADD Фамилия Телефон | GET Фамилия | REMOVE Фамилия | LIST | EXIT");
        while (true) {
            System.out.print("Введите команду: ");

            String inputLine = scanner.nextLine();
            if ("EXIT".equals(inputLine)){
                System.out.println("Программа завершена!");
                break;
            }

            String[] arrayParam = inputLine.trim().split(" "); // 0-Команда, 1-Фамилия, 2-Телефон
            int amtParam = arrayParam.length; // кол-во введенных параметров

            String command = "", user = "", tel = ""; // инициализация для работы в if`ах
            if (amtParam > 0) { command = arrayParam[0];}   // В зависимости от кол-ва параметров
            if (amtParam > 1) { user = arrayParam[1];}      // получаем их в определенные переменные
            if (amtParam > 2) { tel = arrayParam[2];}       // чтобы лишний раз не читать массив

            switch (command){ // мечемся по командам
                case "ADD": // 3 параметра: Команда, Фамилия, Телефон
                    if (amtParam != 3){ System.out.println("Неверное кол-во аргументов!"); continue; }
                    ArrayList<String> lstPhone = null;  // По другому не получается!!!
                    if (mapUser.get(user) == null){     // Если записи не существует
                        lstPhone = new ArrayList<>();   // создаем новый список
                    } else {                            // иначе
                        lstPhone = mapUser.get(user);   // считываем его из HASHMAP как значение
                    }
                    lstPhone.add(tel);                  // добавляем телефон к списку
                    mapUser.put(user,lstPhone);         // сохраняем обратно
                    continue;
                case "GET": // 2 параметра: Команда, Фамилия
                    if (amtParam != 2){ System.out.println("Неверное кол-во аргументов!"); continue; }
                    if (mapUser.get(user) == null) { System.out.println("Фамилия не найдена"); continue; }
                    System.out.println(user + "=>" + mapUser.get(user));
                    continue;
                case "REMOVE": // 2 параметра: Команда, Фамилия
                    if (amtParam != 2){ System.out.println("Неверное кол-во аргументов!"); continue; }
                    if (mapUser.get(user) == null) {
                        System.out.println("Фамилия не найдена");
                    } else {
                        mapUser.remove(user);
                        System.out.println("Запись удалена!");
                    }
                    continue;
                case "LIST":  // 1 параметр: Команда
                    System.out.println(mapUser);
                    continue;
                default: // Все остальное - нераспознано!!!
                    System.out.println("Команда не распознана!");
            } // end switch
        } // end while(true)
    }
}