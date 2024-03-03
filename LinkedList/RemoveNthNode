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
        ListNode currNode = new ListNode(0);
        currNode = head;

        if(head.next==null && n==1)
        return null;
        if(head==null || head.next==null)
        return head;
        
        int size=0;
        while(currNode!=null)
        {
            currNode=currNode.next;
            size++;
        }
        if(size==n)
        return head.next;
        currNode=head;
        int endpos = size-n;
        for(int i=1; i<endpos; i++)
        {
            currNode=currNode.next;
        }
        currNode.next=currNode.next.next;
        return head;
        
    }
}
