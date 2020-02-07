/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 */

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int size = 0;
        for(int i=0;i<nums.length -1 ;){
            size+= nums[i];
            i+=2;
        }
         int arr[] = new int[size];
        int counter = 0;
        for(int i=0;i<nums.length-1;){
            int freq = nums[i++];
            int val =  nums[i++];
            
            for(int j=0;j<freq;j++)
                arr[counter++] = val;
            
        }
        return arr;
    }
}