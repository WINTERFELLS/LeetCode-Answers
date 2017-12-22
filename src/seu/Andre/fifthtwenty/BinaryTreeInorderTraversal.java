package seu.Andre.fifthtwenty;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinaryTreeInorderTraversal {
    public List<Integer> res = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        search(root);
        return res;
    }
    
    public void search(TreeNode tempNode){
        if(tempNode == null){
            return;
        }else{
            search(tempNode.left);
            res.add(tempNode.val);
            search(tempNode.right);
            return;
        }
    }
}
