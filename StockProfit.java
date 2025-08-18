public class StockProfit {
    public static int maxProfit(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 7, 5, 8, 11, 9};
        System.out.println("Output 1: " + maxProfit(arr1)); // 6

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println("Output 2: " + maxProfit(arr2)); // 0
    }
}
