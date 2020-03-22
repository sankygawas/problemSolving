//https://leetcode.com/problems/excel-sheet-column-number/

class Solution {
    public int titleToNumber(String s) {
        
        
        char[] arr = s.toCharArray();     
        int result = 0;
        for(int i=0;i<arr.length;i++){
            
            result= (result * 26 + ((int) (arr[i]) - 65)) + 1;
            
            
        }
        return result;
    }
}