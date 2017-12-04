package seu.Andre.thirdtwenty;

public class SpiralMatrixII {
	public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                res[i][j] = 0;
            }
        }
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = n-1;
        int num = 1;
        
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int i = colStart; i <= colEnd; i++){
                res[rowStart][i] = num;
                num++;
            }
            rowStart++;
            for(int i = rowStart; i <= rowEnd; i++){
                res[i][colEnd] = num;
                num++;
            }
            colEnd--;
            if(rowStart <= rowEnd){
                for(int i = colEnd; i >= colStart; i--){
                    res[rowEnd][i] = num;
                    num++;
                }
            }
            rowEnd--;
            if(colStart <= colEnd){
                for(int i = rowEnd; i>= rowStart; i--){
                    res[i][colStart] = num;
                    num++;
                }
            }
            colStart++;
        }
        return res;
    }
}
