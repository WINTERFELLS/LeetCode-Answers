package seu.Andre.twentythtwnety;

public class FirstUniqueCharacterinaString {
	public int firstUniqChar(String s) {
        int[] store = new int[26];
        for (char c : s.toCharArray()){
            store[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++){
            if (store[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return - 1;
    }
}
