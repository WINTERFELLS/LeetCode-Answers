package seu.Andre.sixthtwenty;

public class MaximumDepthofBinaryTree {
    public int max;
    
    public int maxDepth(TreeNode root) {
        dfs(root,0);
        return max;
    }
    
    public void dfs(TreeNode root, int level){
        if(root == null){
            max = max > level ? max : level;
            return;
        }else{
            dfs(root.left, level+1);
            dfs(root.right,level+1);
        }
    }
}
