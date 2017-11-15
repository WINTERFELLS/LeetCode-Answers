package seu.Andre.secondtwenty;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        char[][] row = new char[9][9];
        char[][] col = new char[9][9];
        char[][] square = new char[9][9];
        
        row = board;
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                col[j][i] = board[i][j];
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k <9; k++){
                    int quotient = k/3+3*j;
                    int remainder = k%3+3*i;    
                    square[j*3+i][k] = board[quotient][remainder];
                }
            }
        }
        if(isDuplicated(row) || isDuplicated(col) || isDuplicated(square)){
            return false;
        }
        else{
            return true;
        }
        
    }
    
    public boolean isDuplicated(char[][] test){
        for(int i = 0; i < 9; i++){
            int[] temp = {1,1,1,1,1,1,1,1,1};
            for(int j = 0; j < 9; j++){
                char t = test[i][j];
                if(t == '.'){
                    continue;
                }
                else if(temp[t-'1'] == 0){
                    return true;
                }
                else{
                    temp[t-'1'] = 0;
                }
            }
        }
        return false;
    }
}
