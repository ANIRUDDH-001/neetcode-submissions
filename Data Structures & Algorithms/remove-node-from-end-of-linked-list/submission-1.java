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
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==0 || size==1) return null;
        if(n==size) return head.next;
        int count=0;
        temp=head;
        ListNode prev=null;
        while(count<size-n){
            prev=temp;
            temp=temp.next;
            count++;
        }
        prev.next=temp.next;
        return  head;
    }
}
