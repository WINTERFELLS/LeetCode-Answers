package seu.Andre.sixthtwenty;

import java.util.Arrays;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public int flagindex;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        flagindex = postorder.length;
        TreeNode res = builder(inorder, postorder);
        return res;
    }
 
    public TreeNode builder(int[] inorder, int[] postorder) {
        TreeNode root = null;
        if(inorder.length == 0){
            return root;
        }else{
            flagindex--;
            int value = postorder[flagindex];
            root = new TreeNode(value);
            int index = -1;
            for(int i = 0 ; i < inorder.length; i++){
                if(inorder[i] == value){
                    index = i;
                    break;
                }
            }
            System.out.println(value+" "+index);
            int[] leftinorder = Arrays.copyOfRange(inorder, 0, index);
            int[] rightinorder = Arrays.copyOfRange(inorder, index+1, inorder.length);
            //right first, then left
            root.right = builder(rightinorder, postorder);
            root.left = builder(leftinorder, postorder);
            return root;
        }
    }
}
