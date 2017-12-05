package seu.Andre.thirdtwenty;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] temps = s.split(" ");
        if(temps.length == 0){
            return 0;
        }
        String last = temps[temps.length-1];
        return last.length();
    }
}
