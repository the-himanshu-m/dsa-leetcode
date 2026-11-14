/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA, temp2 = headB;

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

            if (temp1 == temp2) return temp1;

            if (temp1 == null) temp1 = headB;
            if (temp2 == null) temp2 = headA;
        }

        return temp1;
    }

    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     int m = size(headA);
    //     int n = size(headB);
        
    //     return m > n ? solution(headA, headB, m - n) : solution(headB, headA, n - m);
    // }

    // private ListNode solution(ListNode large, ListNode small, int diff) {
    //     ListNode temp = large;

    //     for (int i = 0; i < diff; i++) {
    //         temp = temp.next;
    //     }

    //     while (temp != null) {
    //         if (temp == small) return temp;
    //         temp = temp.next;
    //         small = small.next;
    //     }

    //     return temp;
    // }

    // private int size(ListNode head) {
    //     ListNode temp = head;
    //     int size = 0;
    //     while (temp != null) {
    //         temp = temp.next;
    //         size++;
    //     }

    //     return size;
    // }
}