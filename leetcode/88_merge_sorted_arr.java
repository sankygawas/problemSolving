/**
 * https://leetcode.com/problems/merge-sorted-array/
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m-1, tail2 = n-1, finalize = m + n -1;
        
        while(tail1 >= 0 && tail2 >= 0){
            
            nums1[finalize--] = nums2[tail2] > nums1[tail1] ? nums2[tail2--]:nums1[tail1--];
        }
        
        while(tail2 >= 0){
            nums1[finalize--] = nums2[tail2--];
        }
        
    
            
    }
}