/**
 * https://leetcode.com/problems/add-strings/
 */

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length()-1, j = num2.length()-1; i>=0 || j>=0 || carry == 1 ;i--,j--){
            

            int a = i < 0 ? 0 : num1.charAt(i) - '0';
            int b = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.insert(0, (a + b + carry)%10);
            carry = (a + b + carry)/10;
            
        }
        return sb.toString();
        
    }
}