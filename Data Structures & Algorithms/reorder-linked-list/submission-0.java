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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow.next;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        slow.next=null;

        ListNode sec= prev;
        ListNode first= head;
        while(first!=null && sec!=null){
            ListNode tmp1= first.next;
            ListNode tmp2= sec.next;
            first.next=sec;
            sec.next=tmp1;
            first=tmp1;
            sec=tmp2;
        }



    }
}
