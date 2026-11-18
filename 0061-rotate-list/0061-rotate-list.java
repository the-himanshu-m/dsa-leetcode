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
        int size = size(head);
        k %= size;
        if (k % size == 0) return head;

        ListNode temp = head;
        int n = 1;

        while (temp != null && n < size - k) {
            temp = temp.next;
            n++;
        }

        ListNode newHead = temp.next;
        temp.next = null;
        temp = newHead;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = head;
        head = newHead;
        return head;
    }

    private int size (ListNode head) {
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }
}