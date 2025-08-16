public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {-2, 2, 4, 4, 4, 4, 5, 5};

        if (nums.length == 0) {
            System.out.print(0);
            return;
        }

        int k = 1; // index for unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(k); // number of unique elements
        System.out.print("Resulting array = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }
            if (i < nums.length - 1) System.out.print(", ");
        }
        System.out.print("]");
    }
}
