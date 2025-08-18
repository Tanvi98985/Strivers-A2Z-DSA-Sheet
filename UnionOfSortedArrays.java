import java.util.*;

public class UnionOfSortedArrays {
    public static int[] findUnion(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                addIfNotPresent(result, nums1[i]);
                i++;
            } else if (nums1[i] > nums2[j]) {
                addIfNotPresent(result, nums2[j]);
                j++;
            } else {
                addIfNotPresent(result, nums1[i]);
                i++;
                j++;
            }
        }

        while (i < nums1.length) {
            addIfNotPresent(result, nums1[i]);
            i++;
        }

        while (j < nums2.length) {
            addIfNotPresent(result, nums2[j]);
            j++;
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private static void addIfNotPresent(ArrayList<Integer> result, int val) {
        if (result.isEmpty() || result.get(result.size() - 1) != val) {
            result.add(val);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        System.out.println("Output 1: " + Arrays.toString(findUnion(nums1, nums2)));

        int[] nums3 = {3, 4, 6, 7, 9, 9};
        int[] nums4 = {1, 5, 7, 8, 8};
        System.out.println("Output 2: " + Arrays.toString(findUnion(nums3, nums4)));
    }
}
