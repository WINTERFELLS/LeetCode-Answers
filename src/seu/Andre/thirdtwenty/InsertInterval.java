package seu.Andre.thirdtwenty;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

public class InsertInterval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        
        List<Interval> res = new ArrayList<>();
        
        if(intervals == null || intervals.size() == 0){
            res.add(newInterval);
            return res;
        }
        
        int start = newInterval.start;
        int end = newInterval.end;
        boolean flag = false;
        for(int i = 0; i < intervals.size(); i++){
            Interval temp = intervals.get(i);
            //System.out.println(temp.start+" "+temp.end);
            if(!flag){
                if(start > temp.end){
                    res.add(temp);
                    if(i == intervals.size()-1){
                        res.add(newInterval);
                    }
                }else if(end < temp.start){
                    res.add(newInterval);
                    res.add(temp);
                    flag = true;
                }else{
                    res.add(new Interval(Math.min(start, temp.start), Math.max(end, temp.end)));
                    //System.out.println(res.get(res.size()-1).start+" "+res.get(res.size()-1).end);
                    flag = true;
                }
            }else{
                Interval temptrue = res.get(res.size()-1);
                if(temptrue.end < temp.start){
                    res.add(temp);
                }else{
                    res.remove(res.size()-1);
                    res.add(new Interval(Math.min(temptrue.start, temp.start), Math.max(temptrue.end, temp.end)));
                }
            }
        }
        return res;
    }
}

