//https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] arr = new int[26];
        if(s == null || t == null) return false;
        if(s.length() == 0 && t.length() == 0) return true;
        
        if(s.length() != t.length()) return false;
        
        for(char c: s.toCharArray()){
            arr[c-'a']+=1; 
        }
        
        for(char c: t.toCharArray()){
            arr[c-'a']-=1; 
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0) return false;
        }
        return true;
    }
}