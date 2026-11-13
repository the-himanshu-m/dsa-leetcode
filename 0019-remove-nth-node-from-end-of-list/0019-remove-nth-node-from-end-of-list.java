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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = size(head);
        if (n == size) {
            head = head.next;
            return head;
        } else {
            ListNode temp = head;

            for (int i = 1; i < size - n; i++) {
                temp = temp.next;
            }

            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            }

            return head;
        }
    }

    public int size (ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }
}