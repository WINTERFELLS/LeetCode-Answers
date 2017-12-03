package seu.Andre.thirdtwenty;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        dfs(board, 0, res);
        return res;
    }
    
    public void dfs(char[][] board, int col, List<List<String>> res){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(isOK(board, i, col)){
                board[i][col] = 'Q';
                dfs(board, col+1, res);
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
    
    public List<String> construct(char[][] board){
        
        List<String> tempList = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            StringBuffer sb = new StringBuffer();
            for(int j = 0; j < board.length; j++){
                sb.append(board[i][j]);
            }
            String tempString = sb.toString();
            tempList.add(tempString);
        }
        return tempList;
    }
}
