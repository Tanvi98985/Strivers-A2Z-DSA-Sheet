import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        if (nums.length > 1) {
            int first = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            nums[nums.length - 1] = first;
        }

        System.out.println(Arrays.toString(nums));
    }
}
