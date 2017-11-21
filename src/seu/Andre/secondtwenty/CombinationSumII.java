package seu.Andre.secondtwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
	class Solution {
	    
	    public List<List<Integer>> res = new ArrayList<>();
	        
	    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	        //sort first, forbid one solution appears twice;
	        Arrays.sort(candidates);
	        int[] temp = new int[100];
	        int count = 0;
	        int flag = 0;
	        dfs(temp, count, flag, candidates, target);
	        return res;
	    }
	    
	    public void dfs(int[] temp, int count, int flag, int[] candidates, int target){
	        if(target<0){
	            return;
	        }else if(target == 0){
	            List<Integer> t = new ArrayList<>();
	            for(int i = 0; i < count; i++){
	                t.add(temp[i]);
	            }
	            res.add(t);
	            return;
	        }else{
	            int len = candidates.length;
	            for(int i = flag; i < len; i++){
	                if (i > flag && candidates[i] == candidates[i-1]){
	                    continue;
	                } 
	                temp[count] = candidates[i];
	                dfs(temp, count+1, i+1, candidates, target-candidates[i]);
	            }
	        }
	    }
	}
}
