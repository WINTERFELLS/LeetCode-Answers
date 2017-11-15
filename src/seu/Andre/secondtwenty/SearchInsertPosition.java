package seu.Andre.secondtwenty;

public class SearchInsertPosition {
	class Solution {
	    public int searchInsert(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length-1;
	        while(left < right){
	            int mid = (left+right)/2;
	            if(nums[mid] == target){
	                return mid;
	            }
	            else if(target < nums[mid]){
	                right = mid - 1;
	            }
	            else{
	                left = mid + 1;
	            }
	        }
	        if(nums[left] < target){
	            return left + 1;
	        }
	        else{
	            return left;
	        }
	    }
	}
}
