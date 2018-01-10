package seu.Andre.sixthtwenty;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        int level = 1;
        dfs(root, level);
        return res;
    }
    public void dfs(TreeNode root, int level){
        if(root == null){
            return;
        }
        
        if(res.size() >= level){
            List<Integer> tempList = res.get(level-1);
            res.remove(level-1);
            tempList.add(root.val);
            res.add(level-1, tempList);
        }else{
            List<Integer> tempList = new ArrayList<>();
            tempList.add(root.val);
            res.add(tempList);
        }
        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }
}
