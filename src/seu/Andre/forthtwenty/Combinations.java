package seu.Andre.forthtwenty;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        int index = 1;
        dfs(temp, index, n, k);
        return res;
    }
    
    public void dfs(List<Integer> temp, int index, int n, int k){
        if(k == 0){
            //must create a new List to store
            res.add(new ArrayList<Integer>(temp));
            return;
        }else{
            for(int i = index; i <= n; i++){
                temp.add(i);
                dfs(temp, i+1, n, k-1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
