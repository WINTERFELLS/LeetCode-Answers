package seu.Andre.sixthtwenty;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        dfs(root, 0);
        List<List<Integer>> output = new ArrayList<>();
        for(int i = res.size()-1; i >= 0; i--){
            List<Integer> temp = res.get(i);
            output.add(temp);
        }
        return output;
    }
    
    public void dfs(TreeNode root, int level){
        if(root == null){
            return;
        }else{
            List<Integer> tempList;
            if(res.size() <= level){
                tempList = new ArrayList<>();
                res.add(tempList);
            }else{
                tempList = res.get(level);
            }
            tempList.add(root.val);
            dfs(root.left, level+1);
            dfs(root.right, level+1);
        }
    }
}
