package seu.Andre.firsttwenty;

class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {
        if(s==""||p==""){
            return false;
        }
        int len1 = s.length();
        int len2 = p.length();
        boolean dp[][] = new boolean[len1+1][len2+1];
        dp[0][0] = true;
        for(int i = 0; i < len2; i++){
            if (p.charAt(i) == '*' && dp[0][i-1]) {
                dp[0][i+1] = true;
            }
        }
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                if(p.charAt(j) == s.charAt(i)){
                    dp[i+1][j+1] = dp[i][j];
                }
                else if(p.charAt(j) == '.'){
                    dp[i+1][j+1] = dp[i][j];
                }
                else if(p.charAt(j) == '*'){
                    if(p.charAt(j-1) != s.charAt(i) && p.charAt(j-1) != '.'){
                        dp[i+1][j+1] = dp[i+1][j-1];
                    }
                    else {
                        dp[i+1][j+1] = (dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    }
                }
            }
        }
        return dp[len1][len2];
    }
}
