package seu.Andre.eighthtwenty;

//һ�����ҳ���С�ģ�����һ����������һ��Ҳ������
public class FindMinimuminRotatedSortedArray {
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
