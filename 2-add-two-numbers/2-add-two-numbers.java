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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currl1=l1;
        ListNode currl2=l2;
        ListNode dummynode=new ListNode();
        ListNode curr=dummynode;
        int carry=0;
        while(currl1!=null||currl2!=null)
        {
            int sum=carry;
            if(currl1!=null)
            {
                sum+=currl1.val;
                currl1=currl1.next;
            }
                        if(currl2!=null)
            {
                sum+=currl2.val;
                currl2=currl2.next;
            }
            int currentdigit=sum%10;
            carry=sum/10;
            curr.next=new ListNode(currentdigit);
            curr=curr.next;
        }
        if(carry==1)
        {
            curr.next=new ListNode(1);
        }
        return dummynode.next;
    }
}