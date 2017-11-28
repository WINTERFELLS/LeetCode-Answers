package seu.Andre.forthtwenty;

public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        int len = matrix.length;
        if(len == 0){
            return false;
        }
        int temp = 0;
        for(int i = 0; i < len; i++){
            if(matrix[i].length == 0){
                return false;
            }
            else if(target >= matrix[i][0]){
                temp = i;
            }
        }
        //System.out.print(temp);
        for(int i = 0; i < matrix[temp].length; i++){
            if(target == matrix[temp][i]){
                return true;
            }
        }
        return false;
    }
}
