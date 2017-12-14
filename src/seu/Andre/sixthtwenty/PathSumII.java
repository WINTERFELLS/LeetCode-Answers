package seu.Andre.sixthtwenty;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        if(root == null){
            return res;
        }
        
        List<Integer> tempList = new ArrayList<>();
        tempList.add(root.val);
        dfs(root, root.val, sum, tempList);
        
        return res;
    }
    
    public void dfs(TreeNode tempNode, int tempSum, int sum, List<Integer> tempList){
        if(tempNode.left == null && tempNode.right == null && tempSum == sum){
            res.add(new ArrayList<Integer>(tempList));
            return;
        }else if(tempNode.left == null && tempNode.right == null && tempSum != sum){
            return;
        }else{
            if(tempNode.left != null){
                tempList.add(tempNode.left.val);
                dfs(tempNode.left, tempSum+tempNode.left.val, sum, tempList);
                tempList.remove(tempList.size()-1);
            }
            if(tempNode.right != null){
                tempList.add(tempNode.right.val);
                dfs(tempNode.right, tempSum+tempNode.right.val, sum, tempList);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
