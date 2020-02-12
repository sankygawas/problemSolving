/**
 * 
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lengthA = 0;
        ListNode nodeA = headA;
        while(nodeA != null){
            nodeA = nodeA.next;
            lengthA++;
        }
        
        int lengthB = 0;
        ListNode nodeB = headB;
        while(nodeB != null){
            nodeB = nodeB.next;
            lengthB++;
        }
        
        if(lengthA > lengthB){
            for(int i=0;i<lengthA - lengthB;i++)
                headA = headA.next;
        }
        
        else if(lengthB > lengthA){
            for(int i=0;i<lengthB - lengthA;i++)
                headB = headB.next;
        }
        
        while(headA != null && headB != null){
            if(headA == headB)
                return headA;
            else
            {
                headA = headA.next;
                headB = headB.next;
            }
        }
        
        return null;
        
    }
}