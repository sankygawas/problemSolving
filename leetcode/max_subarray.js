/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    
    let sum = nums.reduce((acc,ele)=>{return acc+ele},0);
    let currentSum = sum, previousSum = sum;
    for(let i=0,j=nums.length-1;i<j;){


        if(currentSum - nums[i] > currentSum){
            let val = nums[i];
            previousSum = currentSum;   
            currentSum = currentSum - val;
    
            i++;
            console.log("i:"+i + " currentSum:"+currentSum);
        }
           
       else if(currentSum - nums[j] > currentSum){
            previousSum = currentSum;   
            currentSum = currentSum - val;
            j--;
            console.log("j:"+j + " currentSum:"+currentSum);
        }
           
        if(previousSum === currentSum){
            for(let k=i,l=j;k<=l;k++)
                console.log(nums[k]);
                
            break;
        }
            
        
    }
    console.log(currentSum);
    
};

maxSubArray([-2,1,-3,4,-1,2,1,-5,4]);