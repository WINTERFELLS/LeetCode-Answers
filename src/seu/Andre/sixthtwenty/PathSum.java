package seu.Andre.sixthtwenty;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

public class PathSum {
    public boolean flag = false;
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return flag;
        }
        dfs(root, root.val, sum);
        return flag;
    }
    public void dfs(TreeNode tempNode, int tempSum, int sum){
        if(flag){
            return;
        }else{
            if(tempNode.left == null && tempNode.right == null && tempSum == sum){
                flag = true;
                return;
            }else if(tempNode.left == null && tempNode.right == null && tempSum != sum){
                return;
            }else{
                if(tempNode.left != null){
                    dfs(tempNode.left, tempSum+tempNode.left.val, sum);
                }
                if(tempNode.right != null){
                    dfs(tempNode.right, tempSum+tempNode.right.val, sum);
                }
            }
        }
    }
}
