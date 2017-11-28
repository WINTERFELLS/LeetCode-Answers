package seu.Andre.sixthtwenty;

import java.util.List;

public class Triangle {
	// can not pass the 43th test cases since TLE(dfs)
	/*public int min = Integer.MAX_VALUE;
    public int triangleSize = 0;
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = 0;
        int tempLen = 0;
        int col = 0;
        triangleSize = triangle.size();
        dfs(row, col, tempLen, triangle);
        return min;
    }
    
    public void dfs(int row, int col, int tempLen, List<List<Integer>> triangle){
        if(row == triangleSize){
            min = tempLen < min ? tempLen : min;
            return;
        }
        else{
            List<Integer> tempList = triangle.get(row);
            dfs(row+1, col, tempLen+tempList.get(col), triangle);
            dfs(row+1, col+1, tempLen+tempList.get(col), triangle);
        }
    }*/
	//dp sovled the problem
	public int minimumTotal(List<List<Integer>> triangle) {
        for(int i = triangle.size() - 2; i >= 0; i--)
            for(int j = 0; j <= i; j++)
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
        return triangle.get(0).get(0);
    }
}
