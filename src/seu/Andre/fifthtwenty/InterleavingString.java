package seu.Andre.fifthtwenty;

public class InterleavingString {
	//DFS TLE
/*    public boolean isInterleave(String s1, String s2, String s3) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        if(c1.length + c2.length != c3.length){
            return false;
        }
        boolean flag = dfs(c1,c2,c3,0,0,0);
        return flag;
    }
    
    public boolean dfs(char[] c1, char[] c2, char[] c3, int i, int j, int k){
        if(k == c3.length){
            return true;
        }else if((i < c1.length && j < c2.length) && (c3[k] != c1[i] && c3[k] != c2[j])){
            return false;
        }else{
            boolean flag1 = false;
            boolean flag2 = false;
            if((i < c1.length) && (c3[k] == c1[i])){
                flag1 = dfs(c1,c2,c3,i+1,j,k+1);
            }
            if((j < c2.length) && (c3[k] == c2[j])){
                flag2 = dfs(c1,c2,c3,i,j+1,k+1);
            }
            return (flag1 || flag2);
        }
    }*/
}
