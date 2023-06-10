package Lections;
import java.util.Arrays;
public class Lection1Task2 {
    public static void main(String[] args) {
        int[] numbs = new int[] {1,2,3,4,3,4,3,5};
        int val = 3;
        int first = 0;
        int last = numbs.length - 1;
        int temp;
        while (first <= last) {
            if (numbs[first] == val && numbs[last] != val) {
                temp = numbs[last];
                numbs[last] = numbs[first];
                numbs[first] = temp;
                last--;
                first++;
            } else if (numbs[first] != val) {
                first++;
            }
            else if (numbs[first] == val && numbs[last] == val) {
                last--;
            }
        }
        System.out.println(Arrays.toString(numbs));
    }
}
