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
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        if(head==null)
        {
            return null;
        }
        if(head.next==null && n==1)
        {
           return null; 
        }

        ListNode temp=head;
        int length=0;
        while(temp!=null)
        {
            temp=temp.next;
            length++;
        }
        
        if (length == n)
        {              
            return head.next;
        }

        int count=0;
        ListNode prev = null;
        ListNode curr=head;
        while(count!=length-n)
        {
            prev=curr;
            curr=curr.next;
            count+=1;
        }
        prev.next = curr.next;
        return head;
    }
}