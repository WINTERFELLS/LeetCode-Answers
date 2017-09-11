package seu.Andre.firsttwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SumFour {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        ArrayList<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < len-3; i++){
            if(i>0 && nums[i]==nums[i-1]){
                    continue;
            }
            else{
                for(int j = i+1; j < len-2; j++){
                    if(j>i+1 && nums[j]==nums[j-1]){
                        continue;
                    }
                    else{
                        int sum = target-nums[i]-nums[j];
                        int start = j+1;
                        int end = len-1;
                        while(start<end){
                            if(nums[start]+nums[end]==sum){
                                res.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));
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
                                if(nums[start]+nums[end]>sum){
                                    end--;
                                }
                                else{
                                    start++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
