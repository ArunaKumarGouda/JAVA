/*
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public Node mergeSort(Node head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Find middle
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        // Step 2: Split the list
        middle.next = null;

        // Step 3: Sort both halves
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // Step 4: Merge sorted halves
        return sortedMerge(left, right);
    }

    // Function to merge two sorted lists
    private Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    // Function to get middle of the linked list
    private Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
