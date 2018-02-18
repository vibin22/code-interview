package interview.code.local.treesandgraph;

public class InorderTraversal {



    //When performed on a binary search tree, it visits the nodes in ascending order (hence the name"in-order").


    static void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
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
        inOrderTraversal(root);

    }



}
