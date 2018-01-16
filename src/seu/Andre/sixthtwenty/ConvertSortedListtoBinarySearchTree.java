package seu.Andre.sixthtwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertSortedListtoBinarySearchTree {
public TreeNode sortedListToBST(ListNode head) {
        
        List<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int[] nums = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        TreeNode root = sortedArrayToBST(nums);
        return root;
    }
    
    public TreeNode sortedArrayToBST(int[] nums){
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

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
