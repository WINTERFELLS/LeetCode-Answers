package seu.Andre.eighteenthtwenty;

public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int h = 0;
        int t = c.length-1;
        while(h<t){
            if("AEIOUaeiou".indexOf(c[h]) == -1){
                h++;
            }
            if("AEIOUaeiou".indexOf(c[t]) == -1){
                t--;
            }
            if("AEIOUaeiou".indexOf(c[h])!=-1&&"AEIOUaeiou".indexOf(c[t])!=-1){
                char tmp = c[h];
                c[h++]=c[t];
                c[t--]=tmp;
            }
        }
        return new String(c);
    }
}
