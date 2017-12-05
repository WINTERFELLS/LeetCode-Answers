package seu.Andre.twentyfivethtwnety;

public class TeemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length == 0 || duration == 0){
            return 0;
        }
        
        int res = 0;
        int start = timeSeries[0];
        int end = timeSeries[0]+duration;
        for(int i = 0; i < timeSeries.length; i++){
            if(timeSeries[i] > end){
                res += end - start;
                start = timeSeries[i];
            }
            end = timeSeries[i] + duration;
        }
        res += end - start;
        return res;
    }
}
