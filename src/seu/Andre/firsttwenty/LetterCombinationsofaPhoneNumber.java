package seu.Andre.firsttwenty;

import java.util.ArrayList;
import java.util.List;

class LetterCombinationsofaPhoneNumber {
	private static final String[] nums = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        ArrayList<String> res = new ArrayList<>();
        if(digits.length() == 0){
            return res;        
        }
        cal("", digits, 0, res);
        return res;
    }
                                          
    private void cal(String l, String digits, int offset, ArrayList<String> res){
        if(offset >= digits.length()){
            res.add(l);
            return;
        }
        String letters = nums[digits.charAt(offset)-'0'];
        for(int i = 0; i < letters.length(); i++){
            cal(l+letters.charAt(i), digits, offset+1,res);
        }
    }
}
