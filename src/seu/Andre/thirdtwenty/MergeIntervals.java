package seu.Andre.thirdtwenty;

import java.util.ArrayList;
import java.util.List;

class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}

public class MergeIntervals {
	public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        int len = intervals.size();
        if(len == 0 || len == 1){
            return intervals;
        }
        // Sort by ascending starting point using an anonymous Comparator lamda expression
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        
        res.add(intervals.get(0));
        for(int i = 1; i < len; i++){
            int start1 = res.get(res.size()-1).start;
            int start2 = intervals.get(i).start;
            int end1 = res.get(res.size()-1).end;
            int end2 = intervals.get(i).end;
            if(end1  < start2){
                res.add(intervals.get(i));
            }else{
                res.remove(res.size()-1);
                Interval tempInterval = new Interval(Math.min(start1, start2), Math.max(end1, end2));
                res.add(tempInterval);
            }
        }
        return res;
    }
}
