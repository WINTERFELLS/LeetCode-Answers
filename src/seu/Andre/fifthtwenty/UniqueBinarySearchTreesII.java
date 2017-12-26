package seu.Andre.fifthtwenty;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        if(n == 0){
            List<TreeNode> res = new ArrayList<TreeNode>();
            return res;
        }
        return generateSubTrees(1,n);
    }
    
    public List<TreeNode> generateSubTrees(int s, int e){
        List<TreeNode> res = new ArrayList<TreeNode>();
        
        if(s>e){
            res.add(null);
            return res;
        }
        for(int i = s; i <= e; i++){
            List<TreeNode> leftTree = generateSubTrees(s,i-1);
            List<TreeNode> rightTree = generateSubTrees(i+1,e);
                
            for(TreeNode left : leftTree){
                for(TreeNode right : rightTree){                        
                    TreeNode root = new TreeNode(i);
                    root.left = left;                        
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}