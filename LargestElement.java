public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 0, 99, -40};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.print(max);
    }
}
