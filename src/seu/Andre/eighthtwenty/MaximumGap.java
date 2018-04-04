package seu.Andre.eighthtwenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * �����ҳ���������ֵ����Сֵ��Ȼ��Ҫȷ��ÿ��Ͱ����������Ϊ(���ֵ - ��Сֵ) / ���� + 1��
 * ��ȷ��Ͱ�ĸ�������Ϊ(���ֵ - ��Сֵ) / Ͱ������ + 1��
 * Ȼ����Ҫ��ÿ��Ͱ���ҳ��ֲ����ֵ����Сֵ��
 * ��������������������ͬһ��Ͱ�У�
 * ����һ��Ͱ����Сֵ����һ��Ͱ�����ֵ֮��ļ��
 */
public class MaximumGap {
	public int maximumGap(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = max > nums[i] ? max : nums[i];
            min = min < nums[i] ? min : nums[i];
        }
        int size = (max - min)/nums.length + 1;
        
        int[] bucketsMIN = new int[nums.length];
        int[] bucketsMAX = new int[nums.length];
        List<Integer> temp = new ArrayList<>();
        
        Arrays.fill(bucketsMIN, Integer.MAX_VALUE);
        Arrays.fill(bucketsMAX, Integer.MIN_VALUE);
        
        for(int i = 0; i < nums.length; i++){
            int index = (nums[i] - min)/size;
            bucketsMIN[index] = bucketsMIN[index] < nums[i] ? bucketsMIN[index] : nums[i];
            bucketsMAX[index] = bucketsMAX[index] > nums[i] ? bucketsMAX[index] : nums[i];
            temp.add(index);
        }
        int pre = 0;
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if(!temp.contains(i)){
                continue;
            }else{
                res = res > bucketsMIN[i] - bucketsMAX[pre] ? res : bucketsMIN[i] - bucketsMAX[pre];
                pre = i;
            }
        }
        return res;
    }
}
