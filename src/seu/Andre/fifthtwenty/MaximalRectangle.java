package seu.Andre.fifthtwenty;
//DP with three array: left, right and height;
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        
        if(matrix == null || matrix.length == 0){
            return 0;
        }
        
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        int left[] = new int[collen];
        int right[] = new int[collen];
        int height[] = new int[collen];
        
        for(int j = 0; j < collen; j++){
            right[j] = collen;
        }
        
        int res = 0;
        
        for(int i = 0; i < rowlen; i++){
            int curleft = 0;
            int curright = collen;
            
            for(int j = 0; j < collen; j++){
                if(matrix[i][j] == '1'){
                    height[j]++;
                }else{
                    height[j] = 0;
                }
            }
            
            for(int j = 0; j < collen; j++){
                if(matrix[i][j] == '1'){
                    left[j] = Math.max(left[j], curleft);
                }else{
                    left[j] = 0;
                    curleft = j+1;
                }
            }
            
            for(int j = collen-1; j >= 0; j--){
                if(matrix[i][j] == '1'){
                    right[j] = Math.min(right[j], curright);
                }else{
                    right[j] = collen;
                    curright = j;
                }
            }
            
            for(int j = 0; j < collen; j++){
                res = Math.max(res, (right[j]-left[j])*height[j]);
            }
        }
        return res;
        
    }
}
