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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(); ListNode t = l;
        boolean add = false;
        while(true){
            int cur = 0;
            if(l1 == null && l2 == null && !add) break;
            if(l1 != null){
                cur += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                cur += l2.val;
                l2 = l2.next;
            }
            if(add){
                cur++;
                add = false;
            }
            if(cur >= 10){
                add = true;
                cur -= 10;
            }
            l.next = new ListNode(cur);
            l = l.next;
        }
        return t.next;
    }
}