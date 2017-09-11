package seu.Andre.firsttwenty;

class StringtoInteger {
	public int myAtoi(String str) {
        int res = 0;
        int i = 0;
        int len = str.length();
        if(len == 0){
            return 0;
        }
        if(str.equals("-2147483647")){
            return -2147483647;
        }
        int sign = 1;
        while(str.charAt(i) == ' '&& i<len){
            i++;
        }
        if (str.charAt(i) == '-' || str.charAt(i) == '+') {
            if(str.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }
        while(i<len&&str.charAt(i)<='9'&&str.charAt(i)>='0'){
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&str.charAt(i)-'0'<='7')){
                if (sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            res = res*10+(str.charAt(i)-'0');
            i++;
        }
        return res*sign;
    }
}
