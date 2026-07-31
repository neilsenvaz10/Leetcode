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
class Solution
{
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); 
        ListNode temp1=l1;
        ListNode temp2=l2;

        ListNode curr=dummy;
        int carry=0;
        while(temp1!=null && temp2!=null)
        {
            int sum=temp1.val+temp2.val;
            if(sum>=10)
            {
                ListNode nextNode = new ListNode((sum%10)+carry);
                curr.next=nextNode;
                curr=curr.next;
                carry=1;

                temp1=temp1.next;
                temp2=temp2.next;
            }
            else
            {
                ListNode nextNode = new ListNode((sum+carry)%10);
                curr.next=nextNode;
                curr=curr.next;
                if(sum+carry>=10)
                {
                    carry=1;
                }
                else
                {
                    carry=0;
                }

                temp1=temp1.next;
                temp2=temp2.next;
            }
        }

        while(temp1!=null)
        {
            int nextValue=temp1.val+carry;
            if(nextValue>=10)
            {
                ListNode nextNode = new ListNode(nextValue%10);
                curr.next=nextNode;
                curr=curr.next;
                carry=1;

                temp1=temp1.next;
            }
            else
            {
                ListNode nextNode = new ListNode(nextValue%10);
                curr.next=nextNode;
                curr=curr.next;
                carry=0;

                temp1=temp1.next;
            }
        }
        while(temp2!=null)
        {
            int nextValue=temp2.val+carry;
            if(nextValue>=10)
            {
                ListNode nextNode = new ListNode(nextValue%10);
                curr.next=nextNode;
                curr=curr.next;
                carry=1;

                temp2=temp2.next;
            }
            else
            {
                ListNode nextNode = new ListNode(nextValue%10);
                curr.next=nextNode;
                curr=curr.next;
                carry=0;

                temp2=temp2.next;
            }
        }
        if(carry==1)
        {
            ListNode nextNode=new ListNode(1);
            curr.next=nextNode;
        }
        return dummy.next;
    }
}