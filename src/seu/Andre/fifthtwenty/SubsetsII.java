package seu.Andre.fifthtwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    
    public List<List<Integer>> res = new ArrayList<>();
    public int maxLen = 0;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums == null || nums.length == 0){
            return res;
        }
        
        Arrays.sort(nums);
        
        maxLen = nums.length;
        List<Integer> tempList = new ArrayList<>();
        for(int i = 0; i <= maxLen; i++){
            dfs(0,0,i,tempList,nums);
        }
        return res;
    }
    
    public void dfs(int index, int tempLen, int len, List<Integer> tempList, int[] nums){
        if(tempLen == len){
            if(res.contains(tempList)){
                return;
            }else{
                res.add(new ArrayList<Integer>(tempList));
                return;
            }
        }else{
            for(int i = index; i < maxLen; i++){
                tempList.add(nums[i]);
                dfs(i+1,tempLen+1,len,tempList,nums);
                tempList.remove(tempList.size()-1);
            }
            
        }
    }
}
