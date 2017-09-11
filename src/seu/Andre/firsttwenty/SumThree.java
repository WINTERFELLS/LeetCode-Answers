package seu.Andre.firsttwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SumThree {
	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < len-2; i++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int sum = 0 - nums[i];
                int start = i + 1;
                int end = len-1;
                while(start < end){
                    if(nums[start] + nums[end] == sum){
                        res.add(Arrays.asList(nums[i],nums[start],nums[end]));
                        while(start < end && nums[start] == nums[start+1]){
                            start++;
                        }
                        while(start < end && nums[end] == nums[end-1]){
                            end--;
                        }
                        start++;
                        end--;
                    }
                    else{
                        if(nums[start] + nums[end] < sum){
                            start++;
                        }
                        else{
                            end--;
                        }
                    }
                }
            }
        }
        return res;
    }
}
