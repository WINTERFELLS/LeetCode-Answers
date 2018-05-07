package seu.Andre.eighteenthtwenty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }else{
                map.put(nums1[i], 1);
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                int count = map.get(nums2[i])-1;
                if(count == 0){
                    map.remove(nums2[i]);
                }else{
                    map.put(nums2[i], count);
                }
            }
        }
        int res[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}	
