package seu.Andre.secondtwenty;

import java.util.ArrayList;
import java.util.List;

public class SubmissionDetails {
	class Solution {
	    
	    public List<List<Integer>> res = new ArrayList<>();
	    
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        int[] temp = new int[100];
	        int note = 0;
	        int flag = 0;
	        dfs(temp, note, flag, candidates, target);
	        return res;
	    }
	    
	    public void dfs(int[] temp, int note, int flag, int[] candidates, int target){
	        if(target < 0){
	            return;
	        }else if(target == 0){
	            List<Integer> t = new ArrayList<>();
	            for(int i = 0; i < note; i++){
	                t.add(temp[i]);
	            }
	            res.add(t);
	            return;
	        }else{
	            int len = candidates.length;
	            for(int i = flag; i < len; i++){
	                temp[note] = candidates[i];
	                dfs(temp, note+1, i, candidates, target-candidates[i]);
	            }
	        }
	    }
	    
	}
}
