package seu.Andre.eighthtwenty;

import java.util.ArrayList;
import java.util.List;

//二叉树的先序遍历，dfs
public class BinaryTreePreorderTraversal {
	public List<Integer> res = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return res;
        }
        dfs(root);
        return res;
    }
    public void dfs(TreeNode root){
        res.add(root.val);
        if(root.left == null && root.right == null){
            return;
        }else{
            if(root.left != null){
                dfs(root.left);
            }
            if(root.right != null){
                dfs(root.right);
            }
        }
    }
}	

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

