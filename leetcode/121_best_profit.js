/**
 * 
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * @param {number[]} prices
 * @return {number}
 * 
 * O(n) solution
 */
var maxProfit = function(prices) {
    if(prices.length <= 1)
        return 0;
    
    let minPrice = Infinity, maxProfit = 0
    
    for(let i=0;i<prices.length;i++){
        
        if(prices[i] < minPrice)
            minPrice = prices[i]
        else if (prices[i] - minPrice > maxProfit ){
            maxProfit = prices[i] - minPrice
        }
    }
 
    return maxProfit
    
};