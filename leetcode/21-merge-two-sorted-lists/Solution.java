/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */
// @lc code=start

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n = new ListNode();
        ListNode head = n;
        
        while(list1 != null || list2 != null){
            
            if(list2 == null || list1 != null && list1.val <= list2.val){
                n.next = list1;
                list1 = list1.next;
            } else {
                n.next = list2;
                list2 = list2.next;
            }
            n = n.next;
            
        }
        return head.next;
        
    }
}
// @lc code=end
