package interview.code.local.linkedlist;

/*
A simple linked list
 */
public class Node {
    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while (n.next != null) {
            //just moving the node to next until we find the last node
            n = n.next;
        }
        n.next = end;
    }

    int value() {
        return this.data;
    }

    String print() {
        StringBuilder strb = new StringBuilder();
        Node tmp = this;
        while (tmp != null) {
            //System.out.println();
            strb.append(tmp.value());
            tmp = tmp.next;
        }
        return strb.toString();
    }
}
