package seu.Andre.secondtwenty;

public class SudokuSolver {
	public void solveSudoku(char[][] board) {
        dfs(board,0);
    }
    
    public boolean dfs(char[][] test, int num){
        if(num>=81){
            return true;
        }
        int i = num/9;
        int j = num%9;
        if(test[i][j] != '.'){
            return dfs(test, num+1);
        }else{
            for(char c = '1'; c <= '9'; c++){
                if(isValid(test,i,j,c)){
                    test[i][j] = c;
                    if(dfs(test,num+1)){
                        return true;
                    }else{
                        test[i][j] = '.';
                    }
                }
            }
            return false;
        }
    }
    
    private boolean isValid(char[][] board, int row, int col, char c){
        for(int i = 0; i < 9; i++) {
            if(board[i][col] != '.' && board[i][col] == c) return false; //check row
            if(board[row][i] != '.' && board[row][i] == c) return false; //check column
            if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' && 
board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }
}
