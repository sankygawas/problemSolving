/**
 * 
 * 
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 * Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
 * 
 * 
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
  

    if(head == null || head.next == null)
        return head; 
    
    let node = reverseList(head.next);
    head.next.next = head
    head.next = null;
    return node;
    
    
};


function ListNode(val) {
    this.val = val;
    this.next = null;
} 
let root;
let l = new ListNode(1);
root = l;
l.next = new ListNode(2);
l = l.next;
l.next = new ListNode(3);
l = l.next;
l.next = new ListNode(4);
l = l.next;
l.next = null;

reverseList(root)