package seu.Andre.eighthtwenty;

import java.util.PriorityQueue;
import java.util.Queue;

public class LargestNumber {
	public String largestNumber(int[] nums) {
	    if(nums.length == 0 || nums == null){
	        return "";
	    }
	    final Queue<String> queue = new PriorityQueue<>(nums.length, 
	        (left, right) -> Long.valueOf(right+left).compareTo(Long.valueOf(left+right))
	    );
	    
	    for(int num:nums){
	        queue.offer(num+"");
	    }
	    
	    final StringBuffer sb = new StringBuffer();
	    while(!queue.isEmpty()){
	        sb.append(queue.poll());
	    }
	    final String result = sb.toString();
	    return result.startsWith("0") ? "0" : result;
	}
}
