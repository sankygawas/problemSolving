/**

https://leetcode.com/problems/merge-two-binary-trees/

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        if(t1 == null && t2 == null)
            return null;
        if(t1 != null && t2 != null)
            t1.val+=t2.val;
        
        else if(t1 == null && t2 != null){
            t1 = new TreeNode(t2.val);
            t1.left = null;
            t1.right = null;
            //return t1;
        }
        else if(t2 == null && t1 != null){
            t2 = new TreeNode(t1.val);
            t2.left = null;
            t2.right = null;
            //return t2;
        }
        
       TreeNode leftNode =  mergeTrees(t1.left,t2.left);
       t1.left = leftNode;
       TreeNode rightNode = mergeTrees(t1.right,t2.right);
       t1.right=rightNode;
        
        return t1;
        
    }
}