package seu.Andre.secondtwenty;

public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
        if(haystack.equals(needle)){
            return 0;
        }
        int len = needle.length();
        for(int i = 0; i < haystack.length()-len+1; i++){
            String str = haystack.substring(i,i+len);
            if(str.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
