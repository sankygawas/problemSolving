//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        
        int buyPricePointer = 0;
        int counter = 1;
        while( counter < prices.length){
            
            if(prices[counter] > prices[counter-1]) {
                
                maxProfit+= (prices[counter] - prices[counter-1]);
                
            }
            

            
            counter++;
            
        }
        
        return maxProfit;
    }

}