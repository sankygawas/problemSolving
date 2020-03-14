/**
 * 
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fastPointer = dummy;
        ListNode slowPointer = dummy;
        ListNode previous = dummy;
        for(int i=0;i<n;i++)
            fastPointer = fastPointer.next;
        
        while(fastPointer != null){
            previous = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        previous.next = slowPointer.next;
        
        return dummy.next;
        
        
    }
}