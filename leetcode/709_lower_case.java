/**
 * https://leetcode.com/problems/to-lower-case/
 */

class Solution {
    public String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();        
        for (int i = 0; i < str.length(); i++) {            
            char c = (char)(str.charAt(i) | (char)(32));
            sb.append(c);
        }
        return sb.toString();
    }
}