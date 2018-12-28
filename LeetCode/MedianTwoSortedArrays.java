class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalNumberOfValues = nums1.length + nums2.length;
        int averageTwoMiddles = 0;
        
        if(totalNumberOfValues %2 == 0){
            averageTwoMiddles = 1;
        }
        int[] aux = new int[totalNumberOfValues/2 + 1];
        
        int i = 0;
        int j = 0;
        int auxIdx = 0;
        while(i < nums1.length && j < nums2.length && auxIdx < aux.length){
            if(nums1[i] < nums2[j]){
                aux[auxIdx++] = nums1[i];
                i++;
            }
            else{
                aux[auxIdx++] = nums2[j];
                j++;
            }
        }
        
        while(i < nums1.length && auxIdx < aux.length){
            aux[auxIdx++] = nums1[i++];
        }
        
        while(j < nums2.length && auxIdx < aux.length){
            aux[auxIdx++] = nums2[j++];
        }
        
        //at this point we have filled the array
        if(averageTwoMiddles == 0){
            return (double)aux[aux.length-1];
        }
        return (double)(aux[aux.length - 1] + aux[aux.length-2])/2.0;

        
        
    }
}