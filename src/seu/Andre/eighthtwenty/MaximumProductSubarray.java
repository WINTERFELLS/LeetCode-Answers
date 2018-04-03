package seu.Andre.eighthtwenty;

/*��������Ӵ��ĳ˻���
 * dp
 * ��һ�����鱣�浱ǰ�����ֵ
 * ��һ�����鱣�浱ǰ����Сֵ
 * ͬʱ��ÿһ��ѭ������Ҫ�����µ�ǰ�����ֵ�������������
 */
public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int dpmax[] = new int[nums.length];
        int dpmin[] = new int[nums.length];
        dpmax[0] = nums[0];
        dpmin[0] = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            dpmax[i] = Math.max(Math.max(dpmax[i-1]*nums[i], dpmin[i-1]*nums[i]), nums[i]);
            dpmin[i] = Math.min(Math.min(dpmax[i-1]*nums[i], dpmin[i-1]*nums[i]), nums[i]);
            res = Math.max(res, dpmax[i]);
        }
        return res;
    }
}
