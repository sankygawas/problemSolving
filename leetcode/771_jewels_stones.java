/**
 * 
 * https://leetcode.com/problems/jewels-and-stones/
 */

class Solution {
    public int numJewelsInStones(String J, String S) {
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        String[] arr = S.split("");
        for(int i=0;i<arr.length;i++){
            
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i]) + 1);
            else
                map.put(arr[i],1);
            
        }
        
        String[] jewels = J.split("");
        int counter = 0;
        for(int j=0;j<jewels.length;j++){
            
            if(map.containsKey(jewels[j]))
                counter+=map.get(jewels[j]) ;
           
        }
        
        return counter;
    }
}