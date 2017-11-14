package seu.Andre.fourteenthtwenty;
/*
 * did not solve the problem of big integer;
 */
public class FirstBadVersion {
	public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left < right){
            int mid = (left+right)/2;
            if(!isBadVersion(mid)){
                left = mid + 1;
            }else{
                right = mid ;
            }
        }
        return left;
    }
	//do not make sense;
	public boolean isBadVersion(int n){
		return true;
	}
}
