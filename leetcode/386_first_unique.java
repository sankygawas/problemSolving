//https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.Iterator;
import java.util.LinkedHashSet;

class Solution {
    public int firstUniqChar(String s) {
        
           LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
            Set<Character> set = new HashSet<Character>();
	        char[] arr = s.toCharArray();
	        
	        for(int i=0;i<s.length();i++){
	            Character c = arr[i];
	            if(!set.contains(c)){
	                set.add(c);
	                map.put(c,i);
	            }else {
	            	map.remove(c);
	            }
	        }
	        // To get the Iterator use the iterator() operation
	        
 	        if(!map.isEmpty()) {
 	        	return map.values().iterator().next();
 	        }
 	        else return -1;
    }
}