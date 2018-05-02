package seu.Andre.eleventhtwenty;

public class CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        boolean res[] = new boolean[n];
        for(int i = 2; i < n; i++){
            if(res[i] == false){
                count++;
            }
            for(int j = 2; j*i < n; j++){
                res[j*i] = true;
            }
        }
        return count;
    }
}
