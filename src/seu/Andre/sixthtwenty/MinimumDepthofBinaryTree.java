package seu.Andre.sixthtwenty;

public class MinimumDepthofBinaryTree {
    
    public int min = Integer.MAX_VALUE;
    
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            dfs(root, 1);
            return min;
        }
    }
    
    //judge first, then recursive
    public void dfs(TreeNode root, int level){
        if(root.left == null && root.right == null){
            min = min < level ? min : level;
            return;
        }else if(root.left == null){
            dfs(root.right, level+1);
            return;
        }else if(root.right == null){
            dfs(root.left, level+1);
            return;
        }else{
            dfs(root.left, level+1);
            dfs(root.right, level+1);
            return;
        }
    }
}
