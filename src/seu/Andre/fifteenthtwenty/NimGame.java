package seu.Andre.fifteenthtwenty;

public class NimGame {
	public boolean canWinNim(int n) {
        if(n % 4 == 0){
            return false;
        }
        return true;
    }
}
