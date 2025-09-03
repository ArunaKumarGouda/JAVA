/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
                Node temp = null;
        Node current = head;
        
        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        // Before changing head, check for the cases like 
        // empty list or list with only one node
        if (temp != null) {
            head = temp.prev;
        }
        return head;

    }
}
