package seu.Andre.eighthtwenty;

//ÕÒ×î´óÊý
public class FindPeakElement {
	public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max){
                max = nums[i];
                index = i;
            }
        }
        return index;
        
    }
}
