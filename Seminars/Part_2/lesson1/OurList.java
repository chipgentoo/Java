package Seminars.Part_2.lesson1;

import java.util.ArrayList;

public class OurList<T> extends ArrayList<T> {
    @Override
    public String toString() {
        return "НАШ НОВЫЙ ТУ СТРИНГ!: " + super.toString();
    }
}
