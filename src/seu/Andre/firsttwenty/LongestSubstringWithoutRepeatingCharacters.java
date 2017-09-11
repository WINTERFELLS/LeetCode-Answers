package seu.Andre.firsttwenty;

class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
        String str = "";
        int max = 0;
        boolean flag = true;
        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == s.charAt(i)){
                    flag = false;
                    StringBuffer sb = new StringBuffer(str);
                    sb.append(s.charAt(i));
                    str = sb.toString();
                    String temp = str.substring(j+1,str.length());
                    max = temp.length() > max ? temp.length() : max;
                    str = temp;
                    break;
                }
            }
            if(flag){
                StringBuffer sb = new StringBuffer(str);
                sb.append(s.charAt(i));
                str = sb.toString();
                max = str.length() > max ? str.length() : max;
            }
            flag = true;
        }
        return max;
    }
}
