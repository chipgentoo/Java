package Lections;
public class Lection1Task3 {
    public static void main(String[] args) {
        String word = "Добро пожаловать на курс по Java";
        String[] s = word.split(" ");
        StringBuilder out = new StringBuilder(" ");
        for (int i = s.length - 1; i >= 0; i--) {
            out.append(s[i]).append(" ");
        }
        System.out.println(out);
    }
}
