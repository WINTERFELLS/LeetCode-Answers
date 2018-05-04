package seu.Andre.seventeenthtwenty;

public class PowerofThree {
	public boolean isPowerOfThree(int n) {
	    // 1162261467 is 3^19,  3^20 is bigger than int  
	    return ( n>0 &&  1162261467%n==0);
	}
    public boolean isPowerOfThree2(int n) {
        while(n%3==0 && n>0){
            n /= 3;
        }
        if(n == 1){
            return true;
        }else{
            return false;
        }
    }
}
