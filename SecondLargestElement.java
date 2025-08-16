public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.print(-1);
        } else {
            System.out.print(secondLargest);
        }
    }
}
