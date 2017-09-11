package seu.Andre.firsttwenty;

class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        double resleft = 0;
        double resright = 0;
        double res = 0;
        if(len1 > len2){
            int[] nums3 = nums2;
            nums2 = nums1;
            nums1 = nums3;
            int len = len2;
            len2 = len1;
            len1 = len;
        }
        int min = 0;
        int max = len1;
        int halflen = (len1+len2+1)/2;
        if(len1 == 0){
            if(len2%2==1)
                return nums2[len2/2];
            else
                return (double)(nums2[len2/2-1]+nums2[len2/2])/2;
        }
        
        while(min<=max){
            int i = (min + max)/2;
            int j = halflen-i;
            if(i<len1 && nums2[j-1]>nums1[i]){
                min = i+1;
            }
            else if(i>0 && nums1[i-1]>nums2[j]){
                max = i-1;
            }
            else{
                if(i==0) resleft = nums2[j-1];
                else if(j==0) resleft = nums1[i-1];
                else resleft = nums2[j-1] > nums1[i-1] ? nums2[j-1] : nums1[i-1];
                System.out.println(resleft);
                System.out.println(j);
                if(i==len1) resright = nums2[j];
                else if(j==len2) resright = nums1[i];
                else resright = nums2[j] > nums1[i] ? nums1[i] : nums2[j];
                
                if((len1+len2)%2==1)
                    res = resleft;
                else
                    res = (double)(resleft+resright)/2;
                break;
            }
        }
        return res;
    }
}
