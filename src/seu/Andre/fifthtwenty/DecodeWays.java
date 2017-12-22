package seu.Andre.fifthtwenty;

public class DecodeWays {
    public int numDecodings(String s) {
        if(s == "" || s.length() == 0){
            return 0;
        }
        
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        
        for(int i = 2; i <= s.length(); i++){
            int one = Integer.parseInt(s.substring(i-1,i));
            int two = Integer.parseInt(s.substring(i-2,i));
            System.out.println(one+" "+two);
            if(one >= 1 && one <= 9){
                dp[i] += dp[i-1];
            }
            if(two >= 10 && two <= 26){
                dp[i] += dp[i-2];
            }
        }
        return dp[s.length()];
    }
}	
