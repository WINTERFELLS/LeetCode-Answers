package seu.Andre.tenthtwenty;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
        
    }
    public void reverse(int[] nums, int start, int end){
        int temp = 0;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
