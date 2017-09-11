package seu.Andre.firsttwenty;

class RomantoInteger {
	public int romanToInt(String s) {
        int len = s.length();
        int num[] = new int[len];
        for(int i = 0; i < len; i++){
            switch(s.charAt(i)){
                case 'I':
                    num[i] = 1;
                    break;
                case 'V':
                    num[i] = 5;
                    break;
                case 'X':
                    num[i] = 10;
                    break;
                case 'L':
                    num[i] = 50;
                    break;
                case 'C':
                    num[i] = 100;
                    break;
                case 'D':
                    num[i] = 500;
                    break;
                case 'M':
                    num[i] = 1000;
                    break;
            }
        }
        int sum = 0;
        for(int i = 0; i < len-1; i++){
            if(num[i]<num[i+1]){
                sum -=num[i];
            }
            else{
                sum +=num[i];
            }
        }
        return sum+num[len-1];
    }
}
