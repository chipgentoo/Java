package Seminars.Sem_1;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

/**
 * 3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
public class Sem1Task3 {
    public static void main(String[] args) {
        String username = "";
        String wellcome = "";
        System.out.print("введите Ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner != null) {
            username = scanner.next();
        }
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.parse("05:00"))) wellcome = "Доброе утро ";
        if (currentTime.isAfter(LocalTime.parse("12:00"))) wellcome = "Добрый день ";
        if (currentTime.isAfter(LocalTime.parse("18:00"))) wellcome = "Добрый вечер ";
        if (currentTime.isAfter(LocalTime.parse("23:00"))) wellcome = "Доброй ночи ";
        System.out.println(wellcome + username);
    }
}
