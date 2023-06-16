/**
 * Дана json-строка (можно сохранить в файл и читать из файла):
 * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
 * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
 * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
 * Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
 * Студент [фамилия] получил [оценка] по предмету [предмет].
 * Пример вывода:
 * Студент Иванов получил 5 по предмету Математика.
 * Студент Петрова получил 4 по предмету Информатика.
 * Студент Краснов получил 5 по предмету Физика.
 */
package Sem_2;

import java.io.*;

public class Sem2hw3 {

    private static final String fileName = "inJSON.txt";

    public static String readJSONFile(String fileName) throws IOException {
        String strJSON = "";
        try (FileInputStream fin=new FileInputStream("notes.txt")){
            int count;
            while((count=fin.read())!=-1) {
                System.out.print((char)count);
            }
        }
        return strJSON;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(readJSONFile(fileName));
    }
}
