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
    public ListNode mergeKLists(ListNode[] lists)
    {
        if (lists == null || lists.length == 0) return null;
        if (lists.length == 1) return lists[0]; 

        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode temp=lists[i];
            while(temp!=null)
            {
                list.add(temp.val);
                temp=temp.next;
            }
        }

        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            ListNode nextNode=new ListNode(list.get(i));
            curr.next=nextNode;
            curr=curr.next;
        }
        return dummy.next;
    }
}