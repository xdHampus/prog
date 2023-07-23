/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode flipNodes(ListNode h, ListNode o){
        ListNode n = h.next;
        h.next = o;
        if(n != null)
           return flipNodes(n, h);
        else return h;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        return flipNodes(head, null);
    }
}