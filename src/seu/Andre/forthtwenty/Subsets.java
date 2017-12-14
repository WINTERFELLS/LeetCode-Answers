package seu.Andre.forthtwenty;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<Integer> tempList = new ArrayList<>();
        for(int i = 0; i <= len; i++){
            dfs(tempList, 0, 0, i, len, nums);            
        }
        return res;
    }
    
    public void dfs(List<Integer> tempList, int count, int tempSize, int maxSize, int len, int[] nums){
        if(tempSize == maxSize){
            res.add(new ArrayList<Integer>(tempList));
            return;
        }else{
            for(int i = count; i < len; i++){
                tempList.add(nums[i]);
                dfs(tempList, i+1, tempSize+1, maxSize, len, nums);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
