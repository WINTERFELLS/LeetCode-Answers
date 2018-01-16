package seu.Andre.sixthtwenty;

import java.util.Arrays;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        if(nums.length == 0){
            return root;
        }else{
            root = new TreeNode(nums[nums.length/2]);
            root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length/2));
            root.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length/2+1, nums.length));
        }
        return root;
    }
}
