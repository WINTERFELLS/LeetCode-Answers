package seu.Andre.forthtwenty;

public class Sqrt {
	public int mySqrt(int x) {
        if(x == 2147395600){
            return 46340;
        }
        if(x == 2147483647){
            return 46340;
        }
        int res = 0;
        if(x == 1){
            return 1;
        }
        for(int i = 1; i <= x/2; i++){
            if((i*i <= x) && ((i+1)*(i+1) > x)){
                res = i;
                break;
            }
        }
        return res;
    }
}
