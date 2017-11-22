package seu.Andre.thirdtwenty;

public class TrappingRainWater {
	class Solution {
	    public int trap(int[] height) {
	        int len = height.length;
	        int left = 0;
	        int right = len-1;
	        int ans = 0;
	        while(left<right && height[left] < height[left+1]){
	            left++;
	        }
	        while(left<right && height[right] < height[right-1]){
	            right--;
	        }
	        
	        while(left < right){
	            int l = height[left];
	            int r = height[right];
	            if(l<=r){
	                while(left<right && l >= height[++left]){
	                    ans += l-height[left];
	                }
	            }else{
	                while(left<right && height[--right] <= r){
	                    ans += r-height[right];
	                }
	            }
	        }
	        return ans;
	    }
	}
}
