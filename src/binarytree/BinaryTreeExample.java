package binarytree;

public class BinaryTreeExample {
    private static TreeNode root;
    public static void main(String[] args) {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        root = first;
        first.setLeft(second);
        first.setRight(third);
        second.setLeft(fourth);
        second.setRight(fifth);
    }
}
