package seu.Andre.eighthtwenty;

//��֮ǰͬ���Ĵ��룬����֪����Щ��Ŀ������
public class FindMinimuminRotatedSortedArrayII {
	public int findMin(int[] nums) {
        int res = nums[0];
        int left = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(left > nums[i]){
                res = res > nums[i] ? nums[i] : res;
                break;
            }
        }
        return res;
    }
}	
