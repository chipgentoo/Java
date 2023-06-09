package Lections;
import java.util.Arrays;
public class Lection1Task2 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,3,4,3,5};
        int val = 3;
        int first = 0;
        int last = nums.length - 1;
        int temp = 0;
        while (first <= last) {
            if (nums[first] == val && nums[last] != val) {
                temp = nums[last];
                nums[last] = nums[first];
                nums[first] = temp;
                last--;
                first++;
            } else if (nums[first] != val) {
                first++;
            }
            else if (nums[first] == val && nums[last] == val) {
                last--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
