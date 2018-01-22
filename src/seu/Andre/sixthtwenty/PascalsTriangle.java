package seu.Andre.sixthtwenty;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> generate(int numRows) {
        recursion(1,numRows);
        return res;
    }
    
    public void recursion(int level, int numRows){
        if(level > numRows){
            return;
        }else{
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i < level; i++){
                if(i == 0 || i == level-1){
                    tempList.add(1);
                }else{
                    List<Integer> preList = res.get(level-2);
                    int temp = preList.get(i-1) + preList.get(i);
                    tempList.add(temp);
                }
            }
            res.add(tempList);
            recursion(level+1, numRows);
            return;
        }
    }
}
