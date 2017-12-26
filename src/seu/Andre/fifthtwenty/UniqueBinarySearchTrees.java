package seu.Andre.fifthtwenty;

public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        
        for(int i = 2; i <= n; i++){
            for(int k = 1; k <= i; k++){
                dp[i] += dp[k-1]*dp[i-k];
            }
        }
        return dp[n];
    }
}
