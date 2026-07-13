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
    public void reorderList(ListNode head) 
    {
        if(head==null||head.next==null)//LL should be more than 1 node
        {
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)//Find middle
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow.next;//ListNode curr=head reverses whole ll
        ListNode nextNode=null;
        slow.next=null;//slow.next is starting node after middle
        while(curr!=null)//reverse
        {
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        //head=prev;lose the first half
        ListNode first=head;
        ListNode second=prev;
        while(second!=null)
        {
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}
