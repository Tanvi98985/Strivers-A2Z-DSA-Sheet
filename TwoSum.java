import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                int idx1 = map.get(complement);
                int idx2 = i;
                if (idx1 < idx2) return new int[]{idx1, idx2};
                else return new int[]{idx2, idx1};
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // not expected as per problem
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 6, 2, 10, 3};
        int target1 = 7;
        System.out.println("Output 1: " + Arrays.toString(findTwoSum(nums1, target1)));
        // Expected [0, 1]

        int[] nums2 = {1, 3, 5, -7, 6, -3};
        int target2 = 0;
        System.out.println("Output 2: " + Arrays.toString(findTwoSum(nums2, target2)));
        // Expected [1, 5]
    }
}
