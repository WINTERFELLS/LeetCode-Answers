package seu.Andre.thirteenthtwenty;

public class AddDigits {
    public int addDigits(int num) {
        int out;
        if(num < 10){
            return num;
        }else{
            int res = 0;
            while(num > 0){
                res += num%10;
                num /= 10;
            }
            out = addDigits(res);
        }
        return out;
    }
}
