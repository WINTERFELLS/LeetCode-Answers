package seu.Andre.eleventhtwenty;

public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        if(len == 0){
            return 0;
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j<len){
            sum += nums[j++];
            while(sum >= s){
                min = min < j-i ? min : j-i;
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min ;
    }
}
