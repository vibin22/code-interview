package interview.code.local.linkedlist;

public class GenericNode<T> {
    GenericNode next = null;
    int length = 0;
    private T data = null;

    GenericNode(T d) {
        data = d;
    }

    void appendToTail(T d) {
        GenericNode end = new GenericNode(d);
        GenericNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    T value() {
        return this.data;
    }

    String listAllNodes() {
        StringBuilder strb = new StringBuilder();
        GenericNode tmp = this;
        while (tmp != null) {

            strb.append(tmp.value() + "\t ->");
            tmp = tmp.next;
        }
        return strb.toString();
    }

    int length() {
        GenericNode tmp = this;

        while (tmp != null) {
            length++;
            tmp = tmp.next;
        }
        return length - 1;
    }

}
