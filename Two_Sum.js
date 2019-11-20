/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

https://leetcode.com/problems/two-sum/

*/


/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    let map ={}
    let result = [];
    for(let i=0; i< nums.length; i++){
        
        if(map[target - nums[i]] != undefined){
            result.push(map[target - nums[i]])
            result.push(i);
            break;
           
        }
        map[nums[i]] = i;
    }

    return result
    
};

console.log(twoSum([2,7,11,15],13));
