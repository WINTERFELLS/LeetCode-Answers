package seu.Andre.twentythtwnety;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int temp[] = new int['z'-'a'+1];
        for(char c : magazine.toCharArray()){
            temp['z'-c]++;
        }
        for(char c : ransomNote.toCharArray()){
            if(temp['z'-c] == 0){
                return false;
            }
            temp['z'-c]--;
        }
        return true;
    }
}
