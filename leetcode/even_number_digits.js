/**
 * 
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
var findNumbers = function(nums) {
    
    let num =  nums.reduce((acc,ele)=>{
        
        if(((ele + "").length) % 2 === 0)
            acc++;
        
        return acc;
     },0)
    
    return num
 };