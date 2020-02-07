/**
 * 
 * https://leetcode.com/problems/range-sum-of-bst/
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        depth(root,L,R);
        return sum;
    }
        private void depth(TreeNode root, int L, int R){
            
          if(root != null){
                if(root.val >= L && root.val <= R)
                    sum+=root.val;
                if(L < root.val)
                    depth(root.left,L,R);
                if(R > root.val)
                    depth(root.right,L,R);


            }
          
    }
}