/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> res = new ArrayList<Integer>();
    
        public List<Integer> inorderTraversalRecursive(TreeNode root) {
              
            if(root == null) return arr;
       
            inorderTraversal(root.left);
            arr.add(root.val);
            inorderTraversal(root.right);

            return arr;
        }
    
    
    public List<Integer> inorderTraversal(TreeNode root) {
        

      if(root == null) return res;
      Stack<TreeNode> stack = new Stack<TreeNode>();
      TreeNode curr = root;
      while(curr != null || !stack.isEmpty()){
            
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
        
        
        
        
    }
}