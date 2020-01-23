/**
 * 
 * https://leetcode.com/problems/majority-element/
 * 
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
   
   let majorityKey = nums[0];
    let acc = {}
    for(let num of nums){

        acc[num] = !acc[num]?1:acc[num]+1
            
        if(acc[num] > nums.length/2){
                majorityKey = num;
                break;
        }
    }
  
   
   return majorityKey;
    
};


//Boyer-Moore Voting Algorithm

var majorityElement_Voting = function(nums) {
  
    let counter = 0;  
    let maxElement = nums[0];
    for(let num of nums){
        
        
        if(counter == 0)
            maxElement = num;
        
        counter = (maxElement == num)? counter+1:counter-1;
   
    
    }
       return maxElement
   };
   
   
   
   