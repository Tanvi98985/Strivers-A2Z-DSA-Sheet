public class SingleNumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all numbers
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4, 3, 1, 4};
        System.out.println("Output 1: " + findSingleNumber(nums1)); // 3

        int[] nums2 = {5};
        System.out.println("Output 2: " + findSingleNumber(nums2)); // 5
    }
}
