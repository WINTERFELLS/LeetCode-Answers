package seu.Andre.thirdtwenty;

public class MultiplyStrings {
	class Solution {
	    public String multiply(String num1, String num2) {
	        
	        if(num1 == "" || num2 == ""){
	            return "";
	        }
	        
	        int len1 = num1.length();
	        int len2 = num2.length();
	        int[] temp = new int[len1+len2];
	        for(int i = len1-1; i >=0; i--){
	            for(int j = len2-1; j >= 0; j--){
	                int multi = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
	                int p1 = i+j;
	                int p2 = p1+1;
	                
	                temp[p2] += multi;
	                temp[p1] += temp[p2]/10;
	                temp[p2] = temp[p2]%10;
	            }
	        }
	        
	        int flag = 0;
	        while(flag<temp.length && temp[flag] == 0){
	            flag++;
	        }
	        
	        StringBuffer sb = new StringBuffer("");
	        if(flag == temp.length){
	            sb.append("0");
	        }else{
	              for(int i = flag; i <temp.length ; i++){
	                sb.append(temp[i]);
	            } 
	        }
	        String res = sb.toString();
	        return res;
	    }
	}
}
