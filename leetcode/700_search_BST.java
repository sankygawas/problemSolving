/**
 * 
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;
        if(val == root.val) return root;
        
        return (val < root.val)?searchBST(root.left,val):searchBST(root.right,val);
        
    }
}