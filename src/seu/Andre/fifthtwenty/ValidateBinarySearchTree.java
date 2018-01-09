package seu.Andre.fifthtwenty;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public boolean isValid(TreeNode root, long max, long min){
        if(root == null){
            return true;
        }else if(root.val >= max || root.val <= min){
            return false;
        }else{
            boolean res = isValid(root.left, root.val, min)&&isValid(root.right, max, root.val);
            return res;
        }
    }
}
