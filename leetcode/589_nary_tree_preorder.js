/**
 * 
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/submissions/
 * 
 * // Definition for a Node.
 * function Node(val, children) {
 *    this.val = val;
 *    this.children = children;
 * };
 */
/**
 * @param {Node} root
 * @return {number[]}
 */

var preorder = function(root) {
    let list = [];
    
    function traverse(tree){
        
        if(tree == null) return list;

        list.push(tree.val);
        for(let i=0;i<tree.children.length;i++)
            traverse(tree.children[i]);

        return list;    
    }
    
    return traverse(root);
    
};