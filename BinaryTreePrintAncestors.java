public class BinaryTreePrintAncestors {

    public static void main(String[] args) {

        BinaryTreeNode<Integer> n1, n2, n3, n4, n5, n6, n7, root;

        n1 = new BinaryTreeNode<Integer>(1, null, null);

        n2 = new BinaryTreeNode<Integer>(6, null, null);

        n3 = new BinaryTreeNode<Integer>(2, n1, n2);

        n4 = new BinaryTreeNode<Integer>(5, null, null);

        n5 = new BinaryTreeNode<Integer>(3, n3, n4);

        n6 = new BinaryTreeNode<Integer>(8, null, null);

        n7 = new BinaryTreeNode<Integer>(4, null, n6);

        root = new BinaryTreeNode<Integer>(7, n5, n7);

        System.out.println(root.findAncestors(n2.getData()));

        System.out.println(root.findCommonAncestor(n2,n4).getData());

    }

}