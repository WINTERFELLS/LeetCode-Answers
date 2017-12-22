package seu.Andre.fifthtwenty;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {
    public List<String> res = new ArrayList<>();
    
    public List<String> restoreIpAddresses(String s) {
        dfs(0,"",0,s);
        return res;
    }
    
    public void dfs(int count, String tempIP, int index, String s){
        System.out.println(tempIP);
        if(count > 4){
            return;
        }else if(count == 4 && index == s.length()){
            res.add(tempIP);
            return;
        }else{
            for(int i = 1; i < 4; i++){
                if(index+i > s.length()){
                    break;
                }else{
                    String temp = s.substring(index, index+i);
                    if((temp.startsWith("0") && temp.length() > 1) || (i == 3 && Integer.parseInt(temp) > 255)){
                        continue;
                    }else{
                        dfs(count+1,tempIP+temp+(count == 3 ? "" : "."),index+i,s);
                    }
                }
            }
        }
    }
}
