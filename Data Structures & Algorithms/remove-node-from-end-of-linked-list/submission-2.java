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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        if(size==n) return head.next;
        int ptr=0;
        ListNode prev=null;
        ListNode curr=head;
        while(ptr<size-n){
            prev=curr;
            curr=curr.next;
            ptr++;
        }
        prev.next=prev.next.next;
        return head;
    }
}
