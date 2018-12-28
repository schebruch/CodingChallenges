/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        if(head == null){
            return null;
        }
        while(head != null && head.val == val){
            head = head.next;
        }
        ListNode runner = head;
        ListNode prev = head;        
        
        while(runner != null){
            if(runner.val != val){
                prev = runner;
                runner = runner.next;                            
            }
            else{
                prev.next = runner.next;
                runner = runner.next;               
            }

        }
        return head;
    }
}