package seu.Andre.eighteenthtwenty;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            s.add(nums1[i]);
        }
        for(int i = 0 ;i < nums2.length; i++){
            if(s.contains(nums2[i])){
                if(!list.contains(nums2[i]))
                    list.add(nums2[i]);
            }
        }
        int res[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
