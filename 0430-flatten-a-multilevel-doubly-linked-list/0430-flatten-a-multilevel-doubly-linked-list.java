/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        flattenHelper(head);
        return head;
    }

    private Node flattenHelper(Node head) {
        Node temp = head;
        Node tail = null;
        while (temp != null) {
            Node nextNode = temp.next;

            if (temp.child != null) {
                Node childHead = temp.child;
                Node childTail = flattenHelper(childHead);

                temp.next = childHead;
                childHead.prev = temp;

                temp.child = null;

                if (nextNode != null) {
                    childTail.next = nextNode;
                    nextNode.prev = childTail;
                }

                tail = childTail;
            } else {
                tail = temp;
            }

            temp = nextNode;
        }

        return tail;
    }
}