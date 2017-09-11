package seu.Andre.firsttwenty;

class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer("");
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        for(int i = 0; i < strs[0].length(); i++){
            char temp = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length()){
                    return sb.toString();
                }
                else{
                    if(strs[j].charAt(i) != temp){
                        return sb.toString();
                    }
                }
            }
            sb.append(temp);
        }
        return sb.toString();
    }
}
