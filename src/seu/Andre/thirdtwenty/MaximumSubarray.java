package seu.Andre.thirdtwenty;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        if(nums == null || len == 0){
            return max;
        }
        
        int[] dp = new int[len];
        dp[0] = nums[0];
        for(int i = 1; i < len; i++){
            dp[i] = dp[i-1]+nums[i] > nums[i] ? dp[i-1]+nums[i] : nums[i];
        }
        for(int i = 0; i < len ;i ++){
            max = max > dp[i] ? max : dp[i];
        }
        return max;
    }
}
