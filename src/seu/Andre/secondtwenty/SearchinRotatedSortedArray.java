package seu.Andre.secondtwenty;

public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        System.out.print(start+" "+end);
        while(start <= end){
            int mid = (start+end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[start] <= nums[mid]){
                if(nums[start] <= target && nums[mid] >= target){
                    end = mid - 1;
                } 
                else{
                    start = mid + 1;
                }
            }
            else if(nums[end] >= nums[mid]){
                if(nums[end] >= target && nums[mid] <= target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
