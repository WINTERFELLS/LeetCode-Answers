package seu.Andre.sixthtwenty;

import java.util.Arrays;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
	public int rootindex = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        TreeNode root = null;
        
        if(inorder.length == 0){
            return root;
        }else{
            int value = preorder[rootindex];
            rootindex++;
            root = new TreeNode(value);
            int index = -1;
            for(int i = 0; i < inorder.length; i++){
                if(inorder[i] == value){
                    index = i;
                    break;
                }
            }
            System.out.println(value+" "+index);
            int[] leftinorder = Arrays.copyOfRange(inorder,0,index);
            int[] rightinorder = Arrays.copyOfRange(inorder,index+1,inorder.length);
            //left first, then right
            root.left = buildTree(preorder, leftinorder);
            root.right = buildTree(preorder, rightinorder);
            return root;
        }
    }
}
