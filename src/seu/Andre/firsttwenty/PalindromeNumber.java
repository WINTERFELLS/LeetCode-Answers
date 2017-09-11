package seu.Andre.firsttwenty;

class PalindromeNumber {
	public boolean isPalindrome(int x) {
        int res = 0;
        int temp = x;
        if(x<0){
            return false;
        }
        if(x>=0&&x<=9){
            return true;
        }
        while(temp>0){
            res = res*10+temp%10;
            temp /= 10;
        }
        if(res == x){
            return true;
        }
        else{
            return false;
        }
    }
}
