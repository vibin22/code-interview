package interview.code.local.arraysandstrings;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vibinramakrishnan on 7/20/17.
 */
public class Exp {

    public static void main(String[] args) {

        TreeNode head = new TreeNode();
        head.value = "A";

        TreeNode node1 = new TreeNode();
        node1.value = "B";


        TreeNode node2 = new TreeNode();
        node2.value = "C";


        TreeNode node3 = new TreeNode();
        node3.value = "D";


        TreeNode node4 = new TreeNode();
        node4.value = "E";

        /*

         A
        /
        B
       /
       C
         */

        head.left = node1;

        node1.left = node2;

        head.right = node3;
        node3.left = node4;

        ArrayList<String> ls = new ArrayList<>();


        inOrderTraversal(head, ls);

        for(String s:ls){
            System.out.println(s);
        }
    }

    /*
    The path definition is the complete path from root to leaf
            A
           / \
          B   C
         / \   \
        D   E   F

    Result:
    A->B->D
    A->B->E
    A->C->F

    */
    public static List<String> searchAllPath(TreeNode root) {

        StringBuilder sb = new StringBuilder();
        TreeNode tree = root;
        List<String> result = new ArrayList<String>();

        if (root != null) {

            while (tree != null) {

                if (tree.left != null) {
                    sb.append(tree.value + "->");
                } else {
                    sb.append(tree.value);
                }
                tree = tree.left;
            }
            // sb = "A->B->D"
        }

        String str = sb.toString();
        System.out.println(str);
        return result;

    }

    public static void inOrderTraversal(TreeNode node, ArrayList<String> al) {
        //if (node != null) {

           if (node!=null) {
               inOrderTraversal(node.left, al);
               visit(node, al);
               inOrderTraversal(node.right, al);
           }

    }

    public static void visit(TreeNode node, ArrayList<String> al) {

        if (node != null) {
            al.add(node.value);
        }
    }

    public static class TreeNode {
        public String value;
        public TreeNode left;
        public TreeNode right;
    }

}
