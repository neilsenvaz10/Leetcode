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
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        int length=0;
        while(current!=null)
        {
            length++;
            current=current.next;
        }
        
        int mid=length/2;
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            if(count==mid)
            {
                return temp;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }
}