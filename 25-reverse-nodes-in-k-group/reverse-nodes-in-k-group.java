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

     public ListNode reverseList(ListNode head)
     {
        ListNode prev=null;
        ListNode temp=head;

        while(temp!=null)
        {
            ListNode link=temp.next;
            temp.next=prev;
            prev=temp;
            temp=link;
        }
        return prev;
    }

    private ListNode getKthNode(ListNode curr, int k)
    {
        while (curr != null && --k > 0)
        {
            curr = curr.next;
        }
        return curr;
    }

    public ListNode reverseKGroup(ListNode head, int k)
    {
        if (head == null || k == 1)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {

            ListNode kth = getKthNode(groupPrev.next, k);

            if (kth == null) break;

            ListNode groupNext = kth.next;
            kth.next = null;

            ListNode groupHead = reverseList(groupPrev.next);
            ListNode groupTail = groupPrev.next;
            groupPrev.next = groupHead;
            groupTail.next = groupNext;
            groupPrev = groupTail;
        }

        return dummy.next;
    }
}