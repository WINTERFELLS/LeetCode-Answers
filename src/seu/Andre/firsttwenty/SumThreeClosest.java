package seu.Andre.firsttwenty;

import java.util.Arrays;

class SumThreeClosest {
	public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int min = Math.abs(target - (nums[0]+nums[1]+nums[2]));
        int first = 0;
        int second = 1;
        int third = 2;
        for(int i = 0; i < len-2; i++){
            int start = i + 1;
            int end = len - 1;
            int sum = target - nums[i];
            while(start < end){
                int temp = Math.abs(sum - (nums[start]+nums[end]));
                if(temp<min){
                    first = i;
                    second = start;
                    third = end;
                    min = temp;
                    while(start<end && nums[start] == nums[start+1]){
                        start++;
                    }
                    while(start<end && nums[end] == nums[end-1]){
                        end--;
                    }
                    if(nums[start]+nums[end]<=sum-min){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
                else{
                	if(nums[start]+nums[end]<=sum-min){
                        start++;
                    }
                    else{
                        end--;
                    }
                }
            }
        }
        return nums[first]+nums[second]+nums[third];
    }
}
