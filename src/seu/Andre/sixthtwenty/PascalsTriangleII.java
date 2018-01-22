package seu.Andre.sixthtwenty;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> res = new ArrayList<>();
    
    public List<Integer> getRow(int rowIndex) {
        recursion(0, rowIndex);
        return res;
    }
    
    public void recursion(int level, int rowIndex){
        if(level > rowIndex){
            return;
        }else{
            List<Integer> tempList = new ArrayList<>();
            for(int i = 0; i <= level; i++){
                if(i == 0 || i == level){
                    tempList.add(1);
                }else{
                    int temp = res.get(i-1) + res.get(i);
                    tempList.add(temp);
                }
            }
            res = tempList;
        }
        recursion(level+1, rowIndex);
        return;
    }
}
