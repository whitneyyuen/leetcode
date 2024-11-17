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
        int digit = 0;
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1!=null || l2!=null) {
            int i1 = l1==null?0:l1.val;
            int i2 = l2==null?0:l2.val;
            int sum = 0;
            if (i1+i2+digit>=10) {
                sum = i1+i2+digit-10;
                digit = 1;
            } else {
                sum = i1+i2+digit;
                digit = 0;
            }
            if (l1!=null || l2!=null) {
                head.next = new ListNode(sum);
                head = head.next;
            }
            if (l1!=null)
                l1 = l1.next;
            if (l2!=null)
                l2 = l2.next;
        }
        if (digit==1) {
            head.next = new ListNode(1);
        }
        return result.next;
    }
}