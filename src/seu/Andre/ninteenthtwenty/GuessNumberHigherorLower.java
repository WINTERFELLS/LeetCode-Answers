package seu.Andre.ninteenthtwenty;

public class GuessNumberHigherorLower {
    public int guessNumber(int n) {
        return partition(0,n);
    }
    public int partition(int low, int high){
        if(low > high){
            return -1;
        }
        int mid = low+(high-low)/2;
        System.out.println(mid);
        int t = guess(mid);
        if(t == 0){
            return mid;
        }else if(t == -1){
            return partition(low, mid-1);
        }else{
            return partition(mid+1, high);
        }
    }
    int guess(int num){
    	return 0;
    }
}
