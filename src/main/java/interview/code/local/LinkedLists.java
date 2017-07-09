package interview.code.local;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * Created by vibinramakrishnan on 6/28/17.
 */
public class LinkedLists {
    public static void main(String[] args) {

       /* Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(6);
        head.appendToTail(6);
        head.appendToTail(6);*/


        // System.out.println(deleteDups(head).print());

        // System.out.println(head.print());
        // local.challenge.code.Node afterdelete = deleteNode(head, 4);

        //  System.out.println(afterdelete.print());

        //   printKthToLast(head, 2);

        LinkedlistNode myNode = new LinkedlistNode(1);

        myNode.appendToTail(10);
        myNode.appendToTail(8);
        myNode.appendToTail(4);
        myNode.appendToTail(5);
        myNode.appendToTail(6);
        //  myNode.appendToTail("vibin");

        System.out.println(myNode.listAllNodes());

        //myNode = deleteDups(myNode);
        //System.out.println(myNode.listAllNodes());

        LinkedlistNode p1 = printKthToLast(myNode, 5);
        System.out.println(p1.listAllNodes());


        LinkedlistNode n = partition(myNode, 5);
        System.out.println(n.listAllNodes());

        LinkedlistNode n1 = new LinkedlistNode(1);
        n1.appendToTail(1);
        n1.appendToTail(5);

        LinkedlistNode n2 = new LinkedlistNode(1);
        n2.appendToTail(1);
        n2.appendToTail(1);

        System.out.println("RESULT " + n1.listAllNodes());


        System.out.println("RESULT " + n1.length());


        LinkedlistNode r = addLists(n1, n2);

        System.out.println(r.listAllNodes());

        recursion(7);

    }

    /************************************************************************************/
    /**
     * DELETE  DUPES from LinkedList
     *
     * @param n
     */
    public static LinkedlistNode deleteDups(LinkedlistNode n) {
        Hashtable table = new Hashtable();
        LinkedlistNode head = n;
        LinkedlistNode previous = null;
        while (n != null) {
            if (table.containsKey(n.data)) {
                previous.next = n.next;
            } else {
                table.put(n.data, true);
                previous = n;
            }
            n = n.next;
        }
        return head;
    }

    /**
     * DELETE  DUPES from LinkedList
     *
     * @param n
     */
    public static Node deleteDupsintVersion(Node n) {
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

    //************************************************************************************/


    public static LinkedlistNode printKthToLast(LinkedlistNode head, int k) {

        LinkedlistNode node1 = head;
        LinkedlistNode node2 = head;

        for (int i = 0; i < k; i++) {
            if (node1 == null) return null;
            node1 = node1.next;
        }

        while (node1 != null) {
            node1 = node1.next;
            node2 = node2.next;

        }

        return node2;
    }


    /**
     * PRINT K th TO Nth NODE
     *
     * @param head
     * @param k
     * @return
     */
    public static int printKthToLast2(Node head, int k) {
        if (head == null) {
            return 0;
        }
        int index = printKthToLast2(head.next, k) + 1;
        if (index == k) {
            System.out.println(k + "th to last node is " + head.data);
        }
        return index;
    }


    //*************************************************************************************/

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


//**************************************************

    /**
     * PARTITION:
     * Write code to partition a linked list around a value x, such that all nodes less than x come
     * before all nodes greater than or equal to x. If x is contained within the list the values of x only need
     * to be after the elements less than x (see below). The partition element x can appear anywhere in the
     * "right partition"; it does not need to appear between the left and right partitions
     *
     * @param node
     * @param x
     * @return
     */
    public static LinkedlistNode partition(LinkedlistNode node, Integer x) {
        LinkedlistNode head = node;
        LinkedlistNode tail = node;

        while (node != null) {
            LinkedlistNode next = node.next;

            if ((Integer) node.data < x) {
                 /* Insert node at head. */
                node.next = head;
                head = node;
            } else {
                 /* Insert node at tail. */
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        // The head has changed, so return it to the user.
        return head;
    }

//***********************************************************

    public static LinkedlistNode addLists(LinkedlistNode l1, LinkedlistNode l2) {
        int lenl = 2;
        int len2 = 2;

         /* Pad the shorter list with zeros - see note (1) */
        if (lenl < len2) {
            l1 = padList(l1, len2 - lenl);
        } else {
            l2 = padList(l2, lenl - len2);
        }

         /* Add lists */
        PartialSum sum = addListsHelper(l1, l2);

         /* If there was a carry value left over, insert this at the front of the list.
          * Otherwise, just return the linked list. */
        if (sum.carry == 0) {
            return sum.sum;
        } else {
            LinkedlistNode result = insertBefore(sum.sum, sum.carry);
            return result;
        }
    }

//***************************************************************

    static PartialSum addListsHelper(LinkedlistNode l1, LinkedlistNode l2) {
        if (l1 == null && l2 == null) {
            PartialSum sum = new PartialSum();
            return sum;
        }

         /* Add smaller digits recursively*/
        PartialSum sum = addListsHelper(l1.next, l2.next);

         /* Add carry to current data*/
        int val = sum.carry + (Integer) l1.data + (Integer) l2.data;

         /* Insert sum of current digits*/
        LinkedlistNode full_result = insertBefore(sum.sum, (val % 10));

         /* Return sum so far, and the carry value*/
        sum.sum = full_result;
        sum.carry = val / 10;
        return sum;
    }

    /* Helper function to insert node in the front of a linked list*/
    static LinkedlistNode insertBefore(LinkedlistNode list, int data) {
        LinkedlistNode node = new LinkedlistNode(data);
        if (list != null) {
            node.next = list;
        }
        return node;
    }

    /* Pad the list with zeros*/
    static LinkedlistNode padList(LinkedlistNode l, int padding) {
        LinkedlistNode head = l;
        for (int i = 0; i < padding; i++) {
            head = insertBefore(head, 0);
        }
        return head;
    }

    static void recursion(int num) {

        if (num > 0) {
            num = num - 1;
            recursion(num);
            System.out.println("recursion" + num);
        }
    }

    //********************************************************

    /**
     * DELETE MIDDLE NODE
     * Implement an algorithm to delete a node in the middle (i.e., any node but
     * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
     * that node.
     *
     * @param n
     * @return
     */
    boolean deleteNode(LinkedlistNode n) {
        if (n == null || n.next == null) {
            return false; // Failure
        }
        LinkedlistNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }


    //**********************************************************


    /**
     * reverse the linked list and compare the reversed list to the original list. If they're the
     * same, the lists are identical.
     *
     * @param head
     * @return
     */
    boolean isPalindrome(LinkedlistNode head) {
        LinkedlistNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    LinkedlistNode reverseAndClone(LinkedlistNode node) {
        LinkedlistNode head = null;
        while (node != null) {
            LinkedlistNode n = new LinkedlistNode(node.data); // Clone
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    boolean isEqual(LinkedlistNode one, LinkedlistNode two) {
        while (one != null && two != null) {
            if (one.data != two.data) {

            }
            return false;
        }
        one = one.next;
        two = two.next;

        return one == null && two == null;
    }

    //**********************************************************

    /**
     * Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
       beginning of the loop.
     * @param head
     * @return
     */
    LinkedlistNode FindBeginning(LinkedlistNode head) {
        LinkedlistNode slow = head;
        LinkedlistNode fast = head;

         /* Find meeting point. This will be LOOP_SIZE - k steps into the linked list. */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {//Collision
                break;
            }
        }

         /* Error check - no meeting point, and therefore no loop*/
        if (fast == null || fast.next == null) {
            return null;
        }

         /* Move slow to Head. Keep fast at Meeting Point. Each are k steps from the
          * Loop Start. If they move at the same pace, they must meet at Loop Start . */
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

         /* Both now point to the start of the loop. */
        return fast;
    }


    //************************************************************

    public static class Node {
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

    public static class LinkedlistNode<T> {
        LinkedlistNode next = null;
        int length = 0;
        private T data = null;

        LinkedlistNode(T d) {
            data = d;
        }

        void appendToTail(T d) {
            LinkedlistNode end = new LinkedlistNode(d);
            LinkedlistNode n = this;
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
            LinkedlistNode tmp = this;
            while (tmp != null) {

                strb.append(tmp.value() + "\t ->");
                tmp = tmp.next;
            }
            return strb.toString();
        }

        int length() {
            LinkedlistNode tmp = this;

            while (tmp != null) {
                length++;
                tmp = tmp.next;
            }
            return length - 1;
        }
    }

    public static class PartialSum {
        public LinkedlistNode sum = null;
        public int carry = 0;


    }

    void Print(Node head) {

        StringBuilder strbldr = new StringBuilder();
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
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


