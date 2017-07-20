package interview.code.local;

/**
 * Created by vibinramakrishnan on 7/20/17.
 */
public class PracticeLinkedList {





    public static void main(String[] args) {

        Node node = new Node(5);
        node.appendToTail(4);
        node.appendToTail(6);
        node.appendToTail(8);
        node.print();

        Node deleteNode = deleteNthNode(node, 2);
       // Node deleteNode = deleteNode(node, 1);

        deleteNode.print();

    }


    public static Node deleteNthNode(Node node , int n){

        int i = 1;
        Node temp = node;
        Node prev;
        while (temp.next!=null){


            prev=temp;
            temp = temp.next;


            if(n==1){

                return node.next;

            } else if (i==n){

            prev.next=prev.next.next;
            return node;
            }

            i++;
        }


return node;
    }





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

        void print() {
            StringBuilder strb = new StringBuilder();
            Node tmp = this;
            while (tmp != null) {
                //System.out.println();
                strb.append(tmp.value());
                tmp = tmp.next;
            }
            System.out.println( strb.toString());
        }
    }

}
