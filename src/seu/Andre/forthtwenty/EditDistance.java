package seu.Andre.forthtwenty;

public class EditDistance {
	public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        
        int[][] dp = new int[len1+1][len2+1];
        
        for(int i = 0; i <= len1; i++){
            dp[i][0] = i;
        }
        
        for(int i = 0; i <= len2; i++){
            dp[0][i] = i;
        }
        
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                char a = word1.charAt(i);
                char b = word2.charAt(j);
                if(a == b){
                    dp[i+1][j+1] = dp[i][j];
                }else{
                    int one = dp[i+1][j];
                    int two = dp[i][j+1];
                    int three = dp[i][j];
                    dp[i+1][j+1] = one < (two < three ? two : three) ? one : (two < three ? two : three);
                    dp[i+1][j+1]++;
                }
            }
        }
        return dp[len1][len2];
    }
}
