class Solution {
    public int maxProfit(int[] prices) {
       int min = 0, count = 0;

       for(int i = 0; i < prices.length; i++){
        if(prices[i] < prices[min]){
            min = i;
        }
        int newCount = prices[i] - prices[min];
        if(newCount > count) {
            count = newCount;
        }
       }

        return count;
    }
}
