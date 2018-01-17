package seu.Andre.sixthtwenty;

public class FlattenBinaryTreetoLinkedList {
	private TreeNode pre = null;

	public void flatten(TreeNode root) {
        if(root == null){
            return;
        }else{
        	//right first, then left
            flatten(root.right);
            flatten(root.left);
            root.right = pre;
            root.left = null;
            pre = root;
            return;
        }
	}
}
