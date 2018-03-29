package seu.Andre.secondtwenty;


public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int len = 0;
        for(int i = 0; i < nums.length; i++){
            while(i < nums.length&&nums[i] == val){
                i++; 
            }
            if(i < nums.length){
                nums[len] = nums[i];
                len++;
            }
            else{
                break;
            }
        }
        return len;
    }
}
