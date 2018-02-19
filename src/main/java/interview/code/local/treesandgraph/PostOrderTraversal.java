package interview.code.local.treesandgraph;

public class PostOrderTraversal {

    //Post-Order: Traverse left node, then right node, then current node

    static void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            visit(node);
        }
    }

    public static void visit(TreeNode node) {
        if (node != null) {
            System.out.println(node.data);
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 10, 7,8,34,35,36};

        // We needed this code for other files, so check out the code in the library
        TreeNode root = TreeNode.createMinimalBST(array);
        root.print();
        postOrderTraversal(root);

    }
}
