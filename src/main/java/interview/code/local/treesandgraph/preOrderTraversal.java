package interview.code.local.treesandgraph;

public class preOrderTraversal {

    //Pre-Order: Traverse current node, then left node, then right node

    static void preOrderTraversal(TreeNode node) {
        if (node != null) {
            visit(node);
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);

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
        preOrderTraversal(root);

    }
}
