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
	public static boolean isBadVersion(int n){
		return true;
	}
}

class Solution {
    
    public int res = Integer.MAX_VALUE;
    
    public int firstBadVersion(int n) {
        search(1,n);
        return res;
    }
    public void search(int start, int end){
        if(start >= end){
            res = res < start ? res : start;
            return;
        }
        int mid = start+(end-start)/2;
        if(FirstBadVersion.isBadVersion(mid)){
            res = res < mid ? res : mid;
            search(start, mid);
        }else{
            search(mid+1, end);
        }
        return;
    }
}
