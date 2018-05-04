package seu.Andre.fifteenthtwenty;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                continue;
            }
            for(int j = 0; j < i; j++){
                if(nums[j] == 0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
        }
    }
    public void moveZeroes2(int[] nums) {
    	int j = 0;int n = nums.length;
    	for(int i=0;i<n;i++)
    	    if(nums[i]!=0)
    	        nums[j++]=nums[i];
    	for(;j<n;j++)
    	    nums[j]=0;
    }
}
