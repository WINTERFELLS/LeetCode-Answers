package seu.Andre.thirdtwenty;

public class PermutationSequence {
public int[] num;
    
    public String getPermutation(int n, int k) {
        if(n == 1){
            return "1";
        }
        num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = 1;
        }
        //k-1 is very importan since the kth need to be counted from 0;
        int temp = k-1;
        StringBuffer sb = new StringBuffer();
        while(n > 0){
            int quotient = temp / fac(n-1);
            int remainder = temp % fac(n-1);
            System.out.println(quotient);
            sb.append(getnum(quotient));
            temp = remainder;
            n = n-1;
        }
        String res = sb.toString();
        return res;
    }
    
    public int fac(int n){
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }
    
    public int getnum(int quotient){
        for(int i = 0; i < num.length; i++){
            if(num[i] != 0){
                if(quotient == 0){
                    num[i] = 0;
                    return i+1;
                }else{
                    quotient--;
                }
            }
        }
        return 0;
    }
}
