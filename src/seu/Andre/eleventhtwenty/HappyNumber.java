package seu.Andre.eleventhtwenty;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> inloop = new HashSet<>();
        while(inloop.add(n)){
            n = calsum(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    public int calsum(int n){
        int sum = 0;
        while(n > 0){
            int temp = n%10;
            sum += Math.pow(temp,2);
            n /= 10;
        }
        return sum;
    }
}
