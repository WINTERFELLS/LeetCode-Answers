package seu.Andre.sixthtwenty;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }else{
            return isMirro(root.left, root.right);
        }
    }
    public boolean isMirro(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }if(p == null || q == null){
            return false;
        }else{
            boolean res = (p.val == q.val) && isMirro(p.left, q.right) && isMirro(p.right, q.left);
            return res;
        }
    }
}
