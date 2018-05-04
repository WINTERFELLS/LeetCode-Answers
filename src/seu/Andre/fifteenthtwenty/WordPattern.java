package seu.Andre.fifteenthtwenty;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String arr[] = str.split(" ");
        int len=arr.length;
        if(len!=pattern.length())
            return false;
        Map<Character, String> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(arr[i])){
                    return false;
                }
            }else{
                if(map.containsValue(arr[i])){
                    return false;
                }else{
                    map.put(c,arr[i]);
                }
            }
        }
        return true;
    }
}
