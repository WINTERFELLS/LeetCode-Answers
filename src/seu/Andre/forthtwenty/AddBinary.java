package seu.Andre.forthtwenty;

public class AddBinary {
	public String addBinary(String a, String b) {
        int lena = a.length()-1;
        int lenb = b.length()-1;
        StringBuffer sb = new StringBuffer();
        int flag = 0;
        while(lena >= 0 && lenb >= 0){
            int temp = flag + (a.charAt(lena)-'0') + (b.charAt(lenb)-'0');
            sb.append(temp%2);
            flag = temp/2;
            lena--;
            lenb--;
        }
        while(lena >= 0){
            int temp = flag + (a.charAt(lena)-'0');
            sb.append(temp%2);
            flag = temp/2;
            lena--;
        }
        while(lenb >= 0){
            int temp = flag + (b.charAt(lenb)-'0');
            sb.append(temp%2);
            flag = temp/2;
            lenb--;
        }
        System.out.print(flag);
        if(flag == 1){
            sb.append(1);
        }
        String res = sb.reverse().toString();
        return res;
    }
}
