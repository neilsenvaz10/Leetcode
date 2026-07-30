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

        ListNode curr = head;
        int stepsToTarget = length - n - 1;
        for (int i = 0; i < stepsToTarget; i++)
        {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
    }
}