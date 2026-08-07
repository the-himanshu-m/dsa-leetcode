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
    public boolean isPalindrome(ListNode head) {
        ListNode middle = middle(head);
        ListNode temp = head;
        ListNode temp2 = middle.next;
        middle.next = null;

        temp2 = reverse(temp2);

        while (temp != null && temp2 != null) {
            if (temp.val != temp2.val) return false;

            temp = temp.next;
            temp2 = temp2.next;
        }

        return true;
    }

    private ListNode middle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }

    return slow;
}

    private ListNode reverse (ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}