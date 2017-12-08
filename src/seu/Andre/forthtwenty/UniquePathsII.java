package seu.Andre.forthtwenty;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowLength = obstacleGrid.length;
        int colLength = obstacleGrid[0].length;
        int[][] dp = new int[rowLength][colLength];
        
        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){
                if(obstacleGrid[i][j] == 1){
                    dp[i][j] = 0;
                }else if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }else if(i == 0){
                    dp[i][j] = dp[i][j-1];
                }else if(j == 0){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] +dp[i][j-1];
                }
            }
        }
        return dp[rowLength-1][colLength-1];
    }
}
