package seu.Andre.forthtwenty;

public class UniquePaths {
	/*public int count = 0;
    public int uniquePaths(int m, int n) {
        if(m == 1 && n == 1){
            return 1;
        }
        dfs(2,1,m,n);
        dfs(1,2,m,n);
        return count;
    }
    public void dfs(int nowrow, int nowcol, int m, int n){
        if(nowrow == m && nowcol == n){
            count++;
            return;
        }else if(nowrow > m || nowcol > n){
            return;
        }else{
            dfs(nowrow+1,nowcol,m,n);
            dfs(nowrow,nowcol+1,m,n);
        }
    }*/
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }else if(i == 0){
                    dp[i][j] = dp[i][j-1];
                }else if(j == 0){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1]; 
                }
            }
        }
        return dp[m-1][n-1];
    }
}
