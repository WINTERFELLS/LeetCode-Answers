package seu.Andre.thirdtwenty;

public class NQueensII {
    public int num = 0;
    
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        dfs(board, 0);
        return num;
    }
    public void dfs(char[][] board, int col){
        if(col==board.length){
            num++;
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(isOK(board, i, col)){
                board[i][col] = 'Q';
                dfs(board, col+1);
                board[i][col] = '.';
            }
        }
    }
    public boolean isOK(char[][] board, int row, int col){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 'Q' && (row + j == col + i || row + col == i + j || row == i)){
                    return false;
                }
            }
        }
        return true;
    }
}
