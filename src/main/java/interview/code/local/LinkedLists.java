package interview.code.local;

import java.util.HashSet;

/**
 * Created by vibinramakrishnan on 6/28/17.
 */
public class LinkedLists {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(6);
        head.appendToTail(6);
        head.appendToTail(6);

       // System.out.println(deleteDups(head).print());

       // System.out.println(head.print());
       // local.challenge.code.Node afterdelete = deleteNode(head, 4);

      //  System.out.println(afterdelete.print());

     //   printKthToLast(head, 2);

        LinkedNode myNode = new LinkedNode("Vibin");
        myNode.appendToTail("Nived");
        myNode.appendToTail("Deepthi");
        System.out.println(myNode.listAllNodes());
    }


    /**
     * DELETE  DUPES from LinkedList
     *
     * @param n
     */
    public static Node deleteDups(Node n) {
        HashSet<Integer> set = new HashSet<Integer>();
        Node head = n;
        Node previous = null;
        while (n != null) {
            if (set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
        return head;
    }

    /**
     * PRINT K th TO Nth NODE
     *
     * @param head
     * @param k
     * @return
     */
    public static int printKthToLast(Node head, int k) {
        if (head == null) {
            return 0;
        }
        int index = printKthToLast(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.data);
        }
        return index;
    }

    /**
     * DELETE a NODE FROM LINKED LIST
     *
     * @param head
     * @param d
     * @return
     */
    public static Node deleteNode(Node head, int d) {
        Node n = head;
        if (n.data == d) {
            return head.next; /* moved head */
        }
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head; /* head didn’t change */
            }
            n = n.next;
        }

        return head;
    }


}


//**************************************************

class Node {
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

//***********************************************************


class LinkedNode<T> {
    private T data = null;
    LinkedNode next = null;

    LinkedNode(T d) {
        data = d;
    }

    void appendToTail(T d) {
        LinkedNode end = new LinkedNode(d);
        LinkedNode n = this;
        while (n.next !=null) {
            n=n.next;
        }
        n.next= end;
    }

    T value() {
        return this.data;
    }

    String listAllNodes() {
        StringBuilder strb = new StringBuilder();
        LinkedNode tmp = this;
        while (tmp != null) {

            strb.append(tmp.value());
            tmp = tmp.next;
        }
        return strb.toString();
    }
}

/*
class Stack {
    local.challenge.code.Node top;

    local.challenge.code.Node pop() {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(Object item) {
        local.challenge.code.Node t = new local.challenge.code.Node(item);
        t.next = top;
        top = t;
    }
}

class Queue {
    local.challenge.code.Node front, back;

    void enqueue(Object item) {
        if (!front) {
            back = new local.challenge.code.Node(item);
            first = back;
        } else {
            back.next = new local.challenge.code.Node(item);
            back = back.next;
        }
    }

    local.challenge.code.Node dequeue(local.challenge.code.Node n) {
        if (front != null) {
            Object item = front.data;
            front = front.next;
            return item;
        }
        return null;
    }

}*/
