package seu.Andre.eighthtwenty;

//�������ĺ�Ϊָ����������Ϊ������õģ���������ָ�룬��ǰ�ʹӺ���������
public class TwoSumIIInputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int res[] = new int[2];
        if(len < 2){
            return res;
        }
        int head = 0;
        int tail = len-1;
        while(head < tail){
            int t1 = numbers[head];
            int t2 = numbers[tail];
            if(t1+t2 == target){
                res[0] = head+1;
                res[1] = tail+1;
                break;
            }else if(t1+t2 < target){
                head++;
            }else{
                tail--;
            }
        }
        return res;
    }
}
