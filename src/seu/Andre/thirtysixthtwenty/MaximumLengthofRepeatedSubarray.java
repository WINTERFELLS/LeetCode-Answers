package seu.Andre.thirtysixthtwenty;

public class MaximumLengthofRepeatedSubarray {
	public int findLength(int[] A, int[] B) {
        int len1 = A.length;
        int len2 = B.length;
        int[][] dp = new int[len1][len2];
        int res = 0;
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                if(A[i] == B[j]){
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
        
        for(int i = 0; i < len1; i++){
            for(int j = 0; j < len2; j++){
                res = res>dp[i][j]?res:dp[i][j];
            }
        }
        return res;
    }
}
