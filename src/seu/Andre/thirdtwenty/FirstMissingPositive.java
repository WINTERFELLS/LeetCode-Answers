package seu.Andre.thirdtwenty;

public class FirstMissingPositive {
	class Solution {
	    public int firstMissingPositive(int[] nums) {
	        int[] temp = new int[10000];
	        int flag = 1;
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] <= 0){
	                continue;
	            }else{
	                temp[nums[i]] = 1;
	                if(nums[i]<=flag){
	                    int t = nums[i];
	                    while(temp[t] == 1){
	                        t++;
	                    }
	                    flag = t;
	                }
	            }
	        }
	        return flag;
	    }
	}
}
