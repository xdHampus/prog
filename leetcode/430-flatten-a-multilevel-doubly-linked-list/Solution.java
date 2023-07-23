/*
 * @lc app=leetcode id=430 lang=java
 *
 * [430] Flatten a Multilevel Doubly Linked List
 */
// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    
    public Node rFlatten(Node head){
        if(head == null){
            return head;
        }
        
        if(head.child != null){
            Node n = head.next;
            Node c = head.child;
            head.child = null;
        
            head.next = c;
            c.prev = head;
            
            Node v  = rFlatten(c);  
            if(n != null){
                v.next = n;
                n.prev = v;       
            }
        } 
        
        return head.next != null ? rFlatten(head.next) : head;
    }
    
    public Node flatten(Node head) {
        rFlatten(head);
        return head;
    }
}
// @lc code=end
