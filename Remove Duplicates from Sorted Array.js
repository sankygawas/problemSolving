/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

*/

/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    
    if(nums.length ==0) return 0;
    let len = 1;
    
    for(let i=0; i<nums.length;i++){
        
        if(nums[i] < nums[i+1])
        {
            nums[len++] = nums[i+1]     
        }
        
    }
    return len;
};