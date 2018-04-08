package seu.Andre.eighthtwenty;

//有时候想不清楚就重新想，不要顺着错误的思路继续
public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }
}
