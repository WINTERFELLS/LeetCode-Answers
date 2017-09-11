package seu.Andre.firsttwenty;

class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int area = 0;
        int i = 0;
        int j = height.length - 1;
        if(j<=0){
            return 0;
        }
        while(i<j){
            area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return area;
    }
}
