/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 * Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 * 
 * 
 * 
 * 
 * 
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxDepth = function(root) {
  
    if(root == null)
        return 0;
     
     let leftDepth = maxDepth(root.left) + 1;
         
     let rightDepth = maxDepth(root.right) + 1;
         
   if(leftDepth > rightDepth)
       return leftDepth;
   else
       return rightDepth;
 
     
     
     
 };