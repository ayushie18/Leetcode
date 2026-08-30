class Solution {
    int ans=0;
    public void countReverse(int[] a,int[] b){
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if((long)a[i]>(long)2*b[j]){
                ans+=a.length-i;
                j++;
            }
            else i++;
        }
        
    }
    public void merge(int[] nums,int [] a,int[]b){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length ){
            if(a[i]<=b[j]){
                nums[k++]=a[i++];
            }
            else{
                nums[k++]=b[j++];
            }
        }
        while(i<a.length) nums[k++]=a[i++];
        while(j<b.length) nums[k++]=b[j++];


    }
    public void mergeSort(int[] nums){
        int n=nums.length;
        if(n<=1) return ;

        int [] a=new int[n/2];
        int [] b=new int[n-n/2];

        for(int i=0;i<n/2;i++){
            a[i]=nums[i];
        }

        for(int j=0;j<n-n/2;j++){
            b[j]=nums[j+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        countReverse(a,b);
        merge(nums,a,b);
    }

    public int reversePairs(int[] nums) {
         mergeSort(nums);
         return ans;
    }
}