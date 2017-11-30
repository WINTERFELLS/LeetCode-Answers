package seu.Andre.ninteenthtwenty;

public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        
        if(num == 1 || num == 0){
            return true;
        }
        if(num < 0){
            return false;
        }
        
        for(int i = 0; i <= num/2; i++){
            if(i*i == num){
                return true;
            }
        }
        return false;
    }
}
