/**
 * 
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * 
 * 
 * @param {number[]} nums
 * @return {number[]}
 */

 /**
  * Implemented O(n) solution
  */
var findDisappearedNumbers = function(nums) {
    
    let res = [];
    let len = nums.length;
    for(let i=0 ; i<len; i++){
        let index = Math.abs(nums[i]) - 1;
        if(nums[index] > 0)
            nums[index] = -nums[index];
    }
   
    for(let i=0 ; i<len; i++)
        if(nums[i] > 0)
            res.push(i+1);
    
    return res;
    
    
};