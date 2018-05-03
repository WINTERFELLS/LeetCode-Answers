package seu.Andre.thirteenthtwenty;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> rst = new ArrayList<String>();
        if(root == null) return rst;
        StringBuilder sb = new StringBuilder();
        dfs(rst, sb, root);
        return rst;
    }
    
    public void dfs(List<String> rst, StringBuilder sb, TreeNode root){
        if(root == null) return;
        int tmp = sb.length();
        if(root.left == null && root.right == null){
            sb.append(root.val);
            rst.add(sb.toString());
            sb.delete(tmp , sb.length());
            return;
        }
        sb.append(root.val + "->");
        dfs(rst, sb, root.left);
        dfs(rst, sb, root.right);
        sb.delete(tmp , sb.length());
        return;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
