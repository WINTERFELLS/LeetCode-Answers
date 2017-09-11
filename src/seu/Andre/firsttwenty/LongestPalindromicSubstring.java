package seu.Andre.firsttwenty;

class LongestPalindromicSubstring {
	public int from = 0;
    public int maxlen = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2){
            return s;
        }
        for(int i = 0; i < len-1; i++){
            pal(s,i,i);
            pal(s,i,i+1);
        }
        return s.substring(from,from+maxlen);
        
    }
    public void pal(String s, int start, int end){
        while(start>=0&&end<s.length()&&s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        if(maxlen<(end-1)-(start+1)+1){
            from = start+1;
            maxlen = end-start-1;
        }
    }
}
