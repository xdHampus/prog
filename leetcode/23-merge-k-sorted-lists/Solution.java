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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode h = new ListNode(); ListNode t = h;
        
        
        if(lists.length <= 0){
            return null;
        }
        while(true){
            int s = Integer.MAX_VALUE;
            int sI = 0;
            for(int j = 0; j < lists.length; j++){
                if(lists[j] != null && lists[j].val < s){
                    s = lists[j].val;
                    sI = j;
                }
            }
            if(lists[sI] == null){
                break;
            }
            
            h.next = lists[sI];
            h = h.next;
            if(lists[sI].next == null)
                lists[sI] = null;
            else
                lists[sI] = lists[sI].next;
        
        }
        return t.next;
    }
}