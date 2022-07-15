class Solution {
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
ListNode currL1 = l1;
ListNode currL2 = l2;
//create dummy node, it just a placeholder
//to hold a head of linkedlist
ListNode dummyNode = new ListNode();
ListNode curr = dummyNode;
int carry = 0;
while(currL1 != null || currL2 != null){
int sum = carry;
if(currL1 != null){
sum += currL1.val;
currL1 = currL1.next;
}
if(currL2 != null){
sum += currL2.val;
currL2 = currL2.next;
}
int curentDigit = sum % 10;
carry = sum / 10;
//craete new node, with current digit
curr.next = new ListNode(curentDigit);
//move to next node
curr = curr.next;
}
//if carry left,
//add new ncarrry node
if(carry == 1){
curr.next = new ListNode(1);
}
return dummyNode.next;
}
}
​