package seu.Andre.eighthtwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 首先找出数组的最大值和最小值，然后要确定每个桶的容量，即为(最大值 - 最小值) / 个数 + 1，
 * 再确定桶的个数，即为(最大值 - 最小值) / 桶的容量 + 1，
 * 然后需要在每个桶中找出局部最大值和最小值，
 * 而最大间距的两个数不会在同一个桶中，
 * 而是一个桶的最小值和另一个桶的最大值之间的间距
 */
public class MaximumGap {
	public int maximumGap(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = max > nums[i] ? max : nums[i];
            min = min < nums[i] ? min : nums[i];
        }
        int size = (max - min)/nums.length + 1;
        
        int[] bucketsMIN = new int[nums.length];
        int[] bucketsMAX = new int[nums.length];
        List<Integer> temp = new ArrayList<>();
        
        Arrays.fill(bucketsMIN, Integer.MAX_VALUE);
        Arrays.fill(bucketsMAX, Integer.MIN_VALUE);
        
        for(int i = 0; i < nums.length; i++){
            int index = (nums[i] - min)/size;
            bucketsMIN[index] = bucketsMIN[index] < nums[i] ? bucketsMIN[index] : nums[i];
            bucketsMAX[index] = bucketsMAX[index] > nums[i] ? bucketsMAX[index] : nums[i];
            temp.add(index);
        }
        int pre = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(!temp.contains(i)){
                continue;
            }else{
                res = res > bucketsMIN[i] - bucketsMAX[pre] ? res : bucketsMIN[i] - bucketsMAX[pre];
                pre = i;
            }
        }
        return res;
    }
}
