package seu.Andre.forthtwenty;

import java.util.HashMap;

public class MinimumWindowSubstring {
	class Solution {
	    public String minWindow(String s, String t) {
	        String result = "";
	        if(s.isEmpty() ||t.isEmpty()){
	            return result;
	        }
	        
	        HashMap<Character, Integer> map = new HashMap<>();
	        int lens = s.length();
	        int lent = t.length();
	        
	        for(int i = 0; i < lent; i++){
	            char temp = t.charAt(i);
	            if(!map.containsKey(temp)){
	                map.put(temp,1);
	            }
	            else{
	                map.put(temp,map.get(temp)+1);
	            }
	            
	        }
	        
	        int start = 0;
	        int end = 0;
	        int count = 0;
	        int minlen = Integer.MAX_VALUE;
	        int left = 0;
	        while(end != lens){
	            char temp = s.charAt(end);
	            if(map.containsKey(temp)){
	                int n = map.get(temp)-1;
	                map.put(temp,n);
	                if(n>=0){
	                    count++;
	                }
	            }
	            while(count == lent){
	                if(end-start+1 < minlen){
	                    minlen = end-start+1;
	                    left = start;
	                }
	                if(map.containsKey(s.charAt(start))){
	                    char st = s.charAt(start);
	                    int stn = map.get(st)+1;
	                    map.put(st,stn);
	                    if(stn>0){
	                        count--;
	                    }
	                }
	                start++;
	            }
	            end++;
	        }
	        if(minlen == Integer.MAX_VALUE){
	            return result;
	        }
	        else{
	            end = left + minlen;
	            result = s.substring(left,end);
	            return result;
	        }
	    }
	}
}
