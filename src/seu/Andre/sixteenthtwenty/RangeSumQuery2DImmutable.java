package seu.Andre.sixteenthtwenty;

public class RangeSumQuery2DImmutable {
    private int res[][];
    
    public RangeSumQuery2DImmutable(int[][] matrix) {
        
        if(matrix.length != 0)
            res = new int[matrix.length+1][matrix[0].length+1];
        
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
                res[i + 1][j + 1] = sum + res[i][j + 1]; 
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        return res[row2+1][col2+1]-res[row1][col2+1]-res[row2+1][col1]+res[row1][col1];
    }
}
