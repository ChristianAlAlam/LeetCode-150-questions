class Solution {
    public int maxProfit(int[] prices) {
        int min = 0, count = 0;

        for(int i = 1; i<prices.length; i++) {
            if (prices[min] < prices[i]) {
                count += (prices[i] - prices[min]);
            }

            min=i;
        }

        return count;
    }
}
