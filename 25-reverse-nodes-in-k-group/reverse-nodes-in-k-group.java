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
    public ListNode reverseKGroup(ListNode head, int k)
    {
        Stack<ListNode> st=new Stack<>();
        
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        ListNode temp=head;

        while(temp!=null)
        {
            int count=0;
            ListNode groupStart = temp;

            while(temp!=null && count<k)
            {
                st.push(temp);
                temp=temp.next;
                count++;
            }
            
            if(count==k)
            {
                while(!st.isEmpty())
                {
                    curr.next=st.pop();
                    curr=curr.next;
                }
                curr.next = null;
            }
            else
            {
                curr.next = groupStart;
            }
        }
        return dummy.next;
    }
}