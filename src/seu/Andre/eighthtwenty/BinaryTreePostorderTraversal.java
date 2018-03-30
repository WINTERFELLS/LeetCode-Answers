package seu.Andre.eighthtwenty;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//�����������������stack���棬���ҽ��������
public class BinaryTreePostorderTraversal {
    public Stack<Integer> temp = new Stack<>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        dfs(root);
        while(!temp.empty()){
            res.add(temp.pop());
        }
        return res;
    }
    public void dfs(TreeNode root){
        temp.push(root.val);
        if(root.left == null && root.right == null){
            return;
        }else{
            if(root.right != null){
                dfs(root.right);
            }
            if(root.left != null){
                dfs(root.left);
            }
        }
    }
}
