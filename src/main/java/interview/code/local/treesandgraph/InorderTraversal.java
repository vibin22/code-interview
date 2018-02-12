package interview.code.local.treesandgraph;

public class InorderTraversal {



    //When performed on a binary search tree, it visits the nodes in ascending order (hence the name"in-order").


    void inOrderTraversal(TreeNode node) {
        if (node != null) {
        }
        inOrderTraversal(node.left);
        visit(node);
        inOrderTraversal(node.right);
    }


}
