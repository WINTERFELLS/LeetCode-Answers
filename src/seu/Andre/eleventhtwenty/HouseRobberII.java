package seu.Andre.eleventhtwenty;

public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int res = Math.max(cal(nums, 0, nums.length-2), cal(nums, 1, nums.length-1));
        return res;
    }
    
    public int cal(int[] nums, int low, int high){
        int include = 0, exclude = 0;
        for (int j = low; j <= high; j++) {
            int i = include, e = exclude;
            include = e + nums[j];
            exclude = Math.max(e, i);
        }
        return Math.max(include, exclude);
    }
}
