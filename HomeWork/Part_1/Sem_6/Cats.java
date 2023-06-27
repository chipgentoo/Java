/**
 * 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
 * а) информационной системой ветеринарной клиники
 * б) архивом выставки котов
 * в) информационной системой Театра кошек Ю. Д. Куклачёва
 * Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
package HomeWork.Part_1.Sem_6;

import java.util.Objects;

public class Cats {
    private String Name;
    private String Color;
    private String Species;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cats cats = (Cats) o;
        return Objects.equals(Name, cats.Name) && Objects.equals(Color, cats.Color) && Objects.equals(Species, cats.Species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Color, Species);
    }

    @Override
    public String toString() {
        return "Cats{" +
                "Name='" + Name + '\'' +
                ", Color='" + Color + '\'' +
                ", Species='" + Species + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }


}
