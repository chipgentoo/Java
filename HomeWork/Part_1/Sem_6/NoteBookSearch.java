package HomeWork.Part_1.Sem_6;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteBookSearch {
    public static void main(String[] args) {
        int qntNoteBook = 10; // кол-во ноутбуков для генератора
        ArrayList <NoteBooks> lstNoteBooks = new ArrayList<>(); // все ноутбуки
        ArrayList <NoteBooks> fltNoteBooks = new ArrayList<>(); // отфильтрованные
        // генерим разные ноутбуки
        for (int i = 0; i < qntNoteBook; i++) {
            lstNoteBooks.add( i, new NoteBooks() );
        }
        // выводим все ноутбуки построчно
        for (int i = 0; i < lstNoteBooks.size(); i++) {
            System.out.println(lstNoteBooks.get(i));
        }
        // Запрашиваем фильтрацию
        Scanner scanner = new Scanner(System.in);
        System.out.println("Параметром считается то, что находится внутри апострофов. Например ASUS или SSD.");
        System.out.print("Введите параметр для фильтрации: ");
        String filtr = scanner.nextLine();
        for (NoteBooks lstNoteBook : lstNoteBooks) {
            if (lstNoteBook.toString().contains(filtr)) {   // если содержит filtr
                System.out.println(lstNoteBook); // выводим на экран
            }
        }
    }
}
