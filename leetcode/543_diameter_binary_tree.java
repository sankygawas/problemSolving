/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        depth(root);
        return max;
        
      
    }
    private int depth(TreeNode node){
        
        if(node == null ) return 0;
        
        int left = depth(node.left);
        int right = depth(node.right);
        max = Math.max(left+right,max);
        
        return Math.max(left,right) + 1;
        
    }
}