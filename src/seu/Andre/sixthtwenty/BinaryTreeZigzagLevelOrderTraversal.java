package seu.Andre.sixthtwenty;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
public List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = 0;
        dfs(root, level);
        return res;
    }
    public void dfs(TreeNode root, int level){
        if(root == null){
            return;
        }
        
        if(res.size() <= level){
            List<Integer> tempList = new ArrayList<>();
            res.add(tempList);
        }
        
        List<Integer> col = res.get(level);
        
        if(level%2 == 0){
            col.add(root.val);
        }else{
            col.add(0,root.val);
        }
        
        dfs(root.left,level+1);
        dfs(root.right,level+1);

    }
}
