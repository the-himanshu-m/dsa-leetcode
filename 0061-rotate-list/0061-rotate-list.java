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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode temp = head;
        int n = 0;

        while (temp != null && temp.next != null) {
            n++;
            temp = temp.next;
        }
        n++;

        k %= n;
        if (k == n) return head;
        temp.next = head;
        temp = head;

        for (int i = 0; i < n - k - 1; i++) {
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        return newHead;
    }
}