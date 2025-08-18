import java.util.*;

public class LongestSubarraySumK {
    public static int longestSubarray(int[] nums, int k) {
        Map<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0, maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (prefixSum == k) {
                maxLen = i + 1;
            }

            if (prefixMap.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - prefixMap.get(prefixSum - k));
            }

            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println("Output 1: " + longestSubarray(nums1, k1)); // 4

        int[] nums2 = {-3, 2, 1};
        int k2 = 6;
        System.out.println("Output 2: " + longestSubarray(nums2, k2)); // 0
    }
}
