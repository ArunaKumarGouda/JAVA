/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node mergeKLists(Node[] arr) {
        // code here
        if (arr == null || arr.length == 0) return null;

        // Min-heap based on node data
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        // Add first node of each list
        for (Node node : arr) {
            if (node != null) {
                pq.add(node);
            }
        }

        // Dummy head to simplify merging
        Node dummy = new Node(0);
        Node tail = dummy;

        while (!pq.isEmpty()) {
            Node min = pq.poll(); // smallest node
            tail.next = min;
            tail = tail.next;

            if (min.next != null) {
                pq.add(min.next);
            }
        }

        return dummy.next;
    }
}
