package seu.Andre.firsttwenty;

class ZigZagConversion {
	public String convert(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        StringBuffer sb = new StringBuffer("");
        int len = s.length();
        int max = ((len-1)/(numRows-1))/2+1;
         for(int i = 1; i <= max+1; i++){
            int temp = 2*(i-1)*(numRows-1)+1;
            if(temp<=len){
                sb.append(s.charAt(temp-1));
            }
         }
        for(int j = 1; j < numRows-1; j++){
            for(int i = 1; i <= max+1; i++){
                int temp1 = 2*(i-1)*(numRows-1)+1-j;
                int temp2 = 2*(i-1)*(numRows-1)+1+j;
                if(temp1>0&&temp1<=len){
                    sb.append(s.charAt(temp1-1));
                }
                if(temp2<=len){
                    sb.append(s.charAt(temp2-1));
                }
            }
        }
        for(int i = 1; i <= max+1; i++){
            int temp3 = 2*(i-1)*(numRows-1)+numRows;
            if(temp3<=len){
                sb.append(s.charAt(temp3-1));
            }
         }
        String str = sb.toString();
        return str;
    }
}
