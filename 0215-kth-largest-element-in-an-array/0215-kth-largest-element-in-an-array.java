class Solution {
    public int partition(int[]nums,int lo,int hi){
        int i=lo+1;
        int j=hi;
        int mid=lo+(hi-lo)/2;
        int pivot=nums[mid];

        int s=pivot;
        nums[mid]=nums[lo];
        nums[lo]=s;

        while(i<=j){
            while(i<=hi && nums[i]<=pivot) i++;
            while(j>=lo+1 && nums[j]>pivot) j--;

            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;

                i++;
                j--;
            }
           
        }
         int t=nums[j];
         nums[j]=nums[lo];
         nums[lo]=t;
         return j;

    }
    public void QuickSort(int[]nums,int lo,int hi){// not important here
        if(lo>=hi) return;

        int correctIdx=partition(nums,lo,hi);
        QuickSort(nums,lo,correctIdx-1);
        QuickSort(nums,correctIdx+1,hi);

    }
    public int findKthLargest(int[] nums, int k) {
        int target=nums.length-k;

        int lo=0;
        int hi=nums.length-1;
       
        while(lo<=hi){
         int correctIdx=partition(nums,lo,hi);

         if(correctIdx==target){
            return nums[target];
         }
         else if(target>correctIdx){
            lo=correctIdx+1;
         }
         else if(target<correctIdx){
            hi=correctIdx-1;
         }

        }


       return -1; 
    }
}