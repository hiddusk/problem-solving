package binarysearchtree;


/* Insert - Time Complexity O(log n)
   Find   - Time Complexity O(log n)
   Validate - Time Complexity O(n) because we validate all nodes here
 */
public class BinarySearchTree {
    private static TreeNode root=null;

    public static void main(String[] args) {
        root = insert(root, 5);
        root = insert(root, 3);
        root = insert(root, 6);
        root = insert(root, 2);

        Boolean isValid = validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(isValid);
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
        if (root == null) {
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

    public static Boolean validate(TreeNode root, long min, long max) {
        if(root == null) {
            return true;
        }
        if(!(min <= root.getData()) || !(root.getData()<=max)) {
            return false;
        }
        Boolean left = validate(root.getLeft(), min, root.getData());
        if(left) {
            Boolean right = validate(root.getRight(), root.getData(), max);
            return right;
        }
        return false;
    }
}
