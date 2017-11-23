package seu.Andre.thirdtwenty;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	class Solution {
	    
		public List<List<Integer>> res = new ArrayList<>();
		
		public List<List<Integer>> permute(int[] nums){
			
			if(nums == null){
				return res;
			}
			int start = 0;
			collect(start, new ArrayList<Integer>(), nums);
			return res;
		}
		public void collect(int start, List<Integer> temp, int[] nums){
			if(temp.size() == nums.length){
				res.add(temp);
				return;
			}else{
				for(int i = 0; i <= temp.size(); i++){
					List<Integer> newtemp = new ArrayList<>(temp);
					newtemp.add(i,nums[start]);
					collect(start+1, newtemp, nums);
				}
			}
		}
	    
	}
}
