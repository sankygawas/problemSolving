/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */

class Solution {
    public String removeDuplicates(String S) {
        String[] arr = S.split("");
        Stack<String> stack = new Stack<String>();
        
        for(String str:arr){
            
            if(!stack.isEmpty() && stack.peek().equals(str))
            {   
                stack.pop();
                continue;
            }
            
            stack.push(str);
             
        }
        
        StringBuilder builder = new StringBuilder("");
        while(!stack.isEmpty())
            builder.append(stack.pop());
        
        return builder.reverse().toString();
    }
}