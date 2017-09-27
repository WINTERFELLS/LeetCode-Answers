package seu.Andre.secondtwenty;

import java.util.ArrayList;
import java.util.List;

//没有accepted，最后一个测试用例超时了。。。
class SubstringwithConcatenationofAllWords {
	public static int[] num;
    public static int len;
    public static int size;
    public List<Integer> findSubstring(String s, String[] words) {
        
        len = words[0].length();
        size = words.length;
        
        List<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < s.length()-len+1; i++){
            String str = s.substring(i,i+len);
            for(int j = 0; j < size; j++){
                if(words[j].equals(str)){
                    num = new int[size];
                    if(judge(s,words,i,j)){
                        res.add(i);
                        break;
                    }
                }
            }
        }
        return res;
    }
    public boolean judge(String s, String[] words, int compared, int comparison){
        num[comparison] = 1;
        
        boolean flag = true;
        for(int k = 0; k < size; k++){
            if(num[k] == 0){
                flag = false;
                break;
            }
        }
        
        if(flag){
            return true;
        }
        else{
            if(compared+len+len > s.length()){
        		return false;
        	}
        	else{
	        	String str = s.substring(compared+len,compared+len+len);
	            for(int j = 0; j < size; j++){
	            	if(words[j].equals(str) && num[j] != 1){
	            		if(judge(s,words,compared+len,j)){
	            			return true;
	            		}
                        else{
                            return false;
                        }
	                }
	            }
	            return false;
        	}
        }
    }
}

//附带的测试用main函数
/*public class MainClass {
    public static void main(String[] args) throws IOException {
    	Scanner console = new Scanner(System.in);
    	String s = console.nextLine();
    	String[] words = console.nextLine().split(",");
    	Solution sol = new Solution();
    	List<Integer> res = sol.findSubstring(s, words);
    	System.out.println(res);
    }
}*/
