package seu.Andre.eighthtwenty;

//和之前同样的代码，并不知道这些题目的意义
public class FindMinimuminRotatedSortedArrayII {
	public int findMin(int[] nums) {
        int res = nums[0];
        int left = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(left > nums[i]){
                res = res > nums[i] ? nums[i] : res;
                break;
            }
        }
        return res;
    }
}	
