package seu.Andre.secondtwenty;

public class DivideTwoIntegers {
	public static long dived;
    public int divide(int dividend, int divisor) {
        
        long div = divisor;
        if(divisor == 0){
            return Integer.MAX_VALUE;
        }
        int flag = 1;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor <0)){
            flag = -1;
        }
        if(dividend < 0){
            //��Ҫ��������ת������Ϊԭ����dividend��int���ͣ������ص���int���͵�absֵ���޷���ֵ��dived
            dived = Math.abs((long)dividend);
            System.out.println(dived);
        }
        else{
            dived = dividend;
        }
        if(divisor < 0){
            //����ͬ��
            div = Math.abs((long)divisor);
            System.out.println(div);
        }

        long result = 0;
    
        while(dived >= div){
            result += getRes(div);
        }
        if(flag == -1){
            result = -result;
        }
        if(result > Integer.MAX_VALUE || result+1 < -Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
    
    public long getRes(long div){
        long res = 1;
        while(div < dived){
            div = div << 1;
            res = res << 1;
        }
        if(div != dived){
            div = div >> 1;
            res = res >> 1;
        }
        dived -= div;
        return res;
    }
}
