package seu.Andre.thirdtwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	class Solution {
	    public List<List<String>> groupAnagrams(String[] strs) {
	        
	        List<List<String>> res = new ArrayList<>();
	        
	        if(strs == null || strs.length == 0){
	            return res;
	        }
	        
	        HashMap<String, List<String>> map = new HashMap<>();
	        for(int i = 0; i < strs.length; i++){
	            String temps = strs[i];
	            char[] c = temps.toCharArray();
	            Arrays.sort(c);
	            String s = String.valueOf(c);
	            System.out.println(s);
	            if(map.containsKey(s)){
	                List<String> tempList = map.get(s);
	                tempList.add(temps);
	                map.put(s,tempList);
	            }else{
	                List<String> tempList = new ArrayList<>();
	                tempList.add(temps);
	                map.put(s,tempList);
	            }
	        }
	        
	        for(String key : map.keySet()){
	            res.add(map.get(key));
	        }
	        return res;
	    }
	}
}
