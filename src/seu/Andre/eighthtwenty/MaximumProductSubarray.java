package seu.Andre.eighthtwenty;

/*最大连续子串的乘积，
 * dp
 * 用一个数组保存当前的最大值
 * 另一个数组保存当前的最小值
 * 同时在每一次循环中需要保存下当前的最大值，用来最后的输出
 */
public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int dpmax[] = new int[nums.length];
        int dpmin[] = new int[nums.length];
        dpmax[0] = nums[0];
        dpmin[0] = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            dpmax[i] = Math.max(Math.max(dpmax[i-1]*nums[i], dpmin[i-1]*nums[i]), nums[i]);
            dpmin[i] = Math.min(Math.min(dpmax[i-1]*nums[i], dpmin[i-1]*nums[i]), nums[i]);
            res = Math.max(res, dpmax[i]);
        }
        return res;
    }
}
