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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)
            return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode cur=dummy;
        int count=0;
         ListNode frw=dummy;
        while(cur.next!=null)
        {
            cur=cur.next;
            count++;
            
        }
        while(count>=k)
        {
            cur=pre.next;
            frw=cur.next;
            for(int i=1;i<k;i++)
            {
                cur.next=frw.next;
                frw.next=pre.next;
                pre.next=frw;
                frw=cur.next;
            }
            pre=cur;
            count-=k;
        }
        return dummy.next;
            
    }
}