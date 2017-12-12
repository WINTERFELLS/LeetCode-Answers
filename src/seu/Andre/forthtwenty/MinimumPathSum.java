package seu.Andre.forthtwenty;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
    	int rowLength = grid.length;
        int colLength = grid[0].length;
        int[][] dp = new int[rowLength][colLength];
        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = grid[0][0];
                }else if(i == 0){
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                }else if(j == 0){
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];
                }
            }
        }
        return dp[rowLength-1][colLength-1];
    }
}
