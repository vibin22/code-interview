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

        head.left=node1;

        node1.left=node2;

        searchAllPath(head);
    }

    public static class TreeNode {
        public String value;
        public TreeNode left;
        public TreeNode right;
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
        List<String> result = new ArrayList<>();

        if(root!=null) {

            while (tree!=null) {

                if(tree.left!=null) {
                    sb.append(tree.value+"->");
                } else {
                    sb.append(tree.value);
                }
                tree=tree.left;
            }
            // sb = "A->B->D"
        }

        String str =  sb.toString();
        System.out.println(str);
        return result;

    }
}
