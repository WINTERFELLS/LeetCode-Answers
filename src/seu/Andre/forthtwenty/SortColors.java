package seu.Andre.forthtwenty;

public class SortColors {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int count = 0;
        for(int i = 0; i < len ; i++){
            if(nums[i] == 0){
                res[count] = 0;
                count++;
            }
        }
        for(int i = 0; i < len ; i++){
            if(nums[i] == 1){
                res[count] = 1;
                count++;
            }
        }
        for(int i = 0; i < len ; i++){
            if(nums[i] == 2){
                res[count] = 2;
                count++;
            }
        }
        for(int i = 0; i < len ; i++){
            nums[i] = res[i];
        }
    }
}
