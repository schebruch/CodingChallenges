/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node == null)
            return;
        
        ListNode prev = node;
        ListNode runner = node.next;
        while(runner != null){
            prev.val = runner.val;
            runner = runner.next;
            if(runner == null){
                prev.next = null;
                break;
            }
            prev = prev.next;
        }
    }
}