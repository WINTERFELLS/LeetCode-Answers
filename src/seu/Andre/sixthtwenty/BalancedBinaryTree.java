package seu.Andre.sixthtwenty;

public class BalancedBinaryTree {
    private static final int UNBALANCED = -99;

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getHeight(root) != UNBALANCED;
    }

    private int getHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if (l == UNBALANCED || r == UNBALANCED || Math.abs(l-r) > 1) {
            return UNBALANCED;
        }
        return 1 + Math.max(l,r);
    }
}
