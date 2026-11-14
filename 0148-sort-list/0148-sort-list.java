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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode middle = middle(head);
        ListNode rightHead = middle.next;
        middle.next = null;
        ListNode leftHead = head;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return merge(leftHead, rightHead);
    }

    private ListNode middle (ListNode head) {
        ListNode slow = head, fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    private ListNode merge(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }

        ListNode result = l1;
        while (l1 != null && l2 != null) {
            ListNode temp = l1;

            while (l1 != null && l1.val <= l2.val) {
                temp = l1;
                l1 = l1.next;
            }

            temp.next = l2;
            temp = l1;
            l1 = l2;
            l2 = temp;
        }

        return result;
    }
}