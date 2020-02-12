/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null) return true;
        
        
        ListNode walker = head;
        ListNode runner = head;
        
        Stack<Integer> stack = new Stack<Integer>();
  
        while(runner != null && runner.next != null){
            stack.push(walker.val);
            walker = walker.next;
            runner = runner.next.next;

        }
        
        if(runner != null && runner.next == null) walker=walker.next;
       
        
        while(!stack.isEmpty() && walker != null){
            if(stack.pop() != walker.val)
                return false;
            
            walker = walker.next;
        }
        
        if(walker!= null || !stack.isEmpty()) return false;
        else return true;
        
        
        
    }
}