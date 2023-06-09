package Lections;
public class Lection1Task3 {
    public static void main(String[] args) {
        String word = "Добро пожаловать на курс по Java";
        String[] s = word.split(" ");
        String out = " ";
        for (int i = s.length - 1; i >= 0; i--) {
            out += s[i] + " ";
        }
        System.out.println(out);
    }
}
