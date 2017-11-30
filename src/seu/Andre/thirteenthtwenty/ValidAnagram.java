package seu.Andre.thirteenthtwenty;

import java.util.Arrays;

public class ValidAnagram {
	class Solution {
	    public boolean isAnagram(String s, String t) {
	        char[] c1 = s.toCharArray();
	        char[] c2 = t.toCharArray();
	        
	        Arrays.sort(c1);
	        Arrays.sort(c2);
	        
	        String s1 = String.valueOf(c1);
	        String s2 = String.valueOf(c2);
	        
	        if(s1.equals(s2)){
	            return true;
	        }else{
	            return false;
	        }
	    }
	}
}
