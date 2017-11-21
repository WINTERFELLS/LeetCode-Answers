package seu.Andre.secondtwenty;

public class CountandSay {
	class Solution {
	    public String countAndSay(int n) {
	        String s = "1";
	        String res = next(s,n-1);
	        return res;
	    }
	    public String next(String s, int n){
	        if(n == 0){
	            return s;
	        }else{
	            int len = s.length();
	            StringBuffer sb = new StringBuffer("");
	            for(int i = 0; i < len; i++){
	                int count = 0;
	                char temp = s.charAt(i);
	                while(i<len && s.charAt(i) == temp){
	                    count++;
	                    i++;
	                }
	                sb.append(""+count);
	                sb.append(""+temp);
	                i--;
	            }
	            String res = sb.toString();
	            return next(res,n-1);
	        }
	    }
	}
}
