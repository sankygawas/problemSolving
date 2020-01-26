/**
 * 
 * https://leetcode.com/problems/valid-parentheses/
 * 
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    
    let arr = s.split("");
    let stack = []
    for(let i=0;i<arr.length;i++){
        
       if(arr[i] === '(') stack.push(')')
       else if (arr[i] === '{') stack.push('}');
       else if (arr[i] === '[') stack.push(']');
       else if (stack.pop() != arr[i] ) return false;
            
       
    }
    if(stack.length != 0) return false;
    return true;
    
    
    
};