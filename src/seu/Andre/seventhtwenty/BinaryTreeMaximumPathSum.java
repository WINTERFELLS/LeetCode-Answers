package seu.Andre.seventhtwenty;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class BinaryTreeMaximumPathSum {
    int maxValue = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        dfsMax(root);
        return maxValue;
    }
    
    public int dfsMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftValue = Math.max(0, dfsMax(root.left));
        int rightValue = Math.max(0, dfsMax(root.right));
        maxValue = Math.max(maxValue, leftValue+rightValue+root.val);
        return Math.max(leftValue, rightValue)+root.val;
    }
}
