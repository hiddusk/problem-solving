package binarysearchtree;

import apple.laf.JRSUIUtils;

public class BinarySearchTree {
    private static TreeNode root=null;

    public static void main(String[] args) {
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 2);
        TreeNode target = search(root, 3);
    }

    public static TreeNode insert(TreeNode root, int value) {
        if(root==null) {
            TreeNode node = new TreeNode(value);
            root = node;
        }
        if(value<root.getData()) {
            root.setLeft(insert(root.getLeft(), value));
        }
        if(value>root.getData()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }

    public static TreeNode search(TreeNode root, int key) {
        if(root==null) {
            return null;
        } else if (root.getData() == key) {
            return root;
        }
        if (key < root.getData()) {
            return search(root.getLeft(), key);
        }
        if (key > root.getData()) {
            return search(root.getRight(), key);
        }
        return null;
    }
}
