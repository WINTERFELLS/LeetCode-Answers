package seu.Andre.twelvethtwenty;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }   
        dfs(root);
        return root;
    }
    public void dfs(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left != null){
            dfs(root.left);
        }
        if(root.right != null){
            dfs(root.right);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
