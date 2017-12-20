package seu.Andre.fifthtwenty;

import java.util.Stack;

//For explanation, please see http://www.geeksforgeeks.org/largest-rectangle-under-histogram/
public class LargestRectangleinHistogram {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        if(heights == null || len == 0){
            return 0;
        }
        
        Stack<Integer> s = new Stack<>();
        int res = 0;
        int i = 0;
        
        while(i < len){
            if(s.empty() || heights[s.peek()] <= heights[i]){
                s.push(i++);
            }else{
                int top = s.peek();
                s.pop();
                int tempres = heights[top]*(s.empty() ? i : i - s.peek() -1);
                res = tempres > res ? tempres : res;
            }
        }
        
        while(s.empty() == false){
            int top = s.peek();
            s.pop();
            int tempres = heights[top]*(s.empty() ? i : i-s.peek() -1);
            res = tempres > res ? tempres : res;
        }
        
        return res;
        
    }
}
