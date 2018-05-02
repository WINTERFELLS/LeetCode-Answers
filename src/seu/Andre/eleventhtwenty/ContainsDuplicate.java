package seu.Andre.eleventhtwenty;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(temp.add(nums[i]) == false){
                return true;
            }
        }
        return false;
    }
}
