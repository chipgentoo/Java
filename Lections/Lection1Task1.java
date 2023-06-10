package Lections;
public class Lection1Task1 {
    public static void main(String[] args) {
        int[] numbs = new int[]{1, 1, 0, 1, 1, 1, 1, 0, 1};
        int count = 0;
        int max = 0;
        int temp = 0;
        for (int numb : numbs) {
            if (numb == 1) {
                count++;
            } else {
                temp = count;
                count = 0;
            }
        }
        if (temp > max) max = temp;
        if (count > max) max = count;
        System.out.println(max);
    }
}
