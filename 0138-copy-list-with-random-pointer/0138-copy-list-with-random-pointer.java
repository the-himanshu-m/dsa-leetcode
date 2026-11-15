/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        temp = head;
        Node res = temp.next;

        while (temp != null) {
            if (temp.random != null) {
                res.random = temp.random.next;
            } else {
                res.random = null;
            }

            temp = temp.next.next;
            if (res.next != null) {
                res = res.next.next;
            } else {
                res = null;
            }
        }

        temp = head;
        Node dummyNode = new Node(-1);
        res = dummyNode;

        while (temp != null) {
            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }

        return dummyNode.next;
    }
}