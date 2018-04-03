package seu.Andre.eighthtwenty;

//一串数找出最小的，其中一半是升序，另一半也是升序
public class FindMinimuminRotatedSortedArray {
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
