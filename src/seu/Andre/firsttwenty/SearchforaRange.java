package seu.Andre.firsttwenty;

public class SearchforaRange {
	class Solution {
	    public int[] searchRange(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length-1;
	        int[] res = {-1, -1};
	        if(nums.length == 0){
	            return res;
	        }
	        while(left < right){
	            int mid = (left+right)/2;
	            if(nums[mid] < target){
	                left = mid + 1;
	            }
	            else{
	                right = mid;
	            }
	        }
	        if(nums[left] != target){
	            return res;
	        }else{
	            res[0] = left;
	        }
	        
	        right = nums.length-1;
	        while(left < right){
	            int mid = (left+right)/2+1;
	            if(nums[mid] > target){
	                right = mid - 1;
	            }
	            else{
	                left = mid;
	            }
	        }
	        res[1] = right;
	        return res;
	    }
	}
}
