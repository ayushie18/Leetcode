class Solution {
    public boolean containsSubarray(int[]arr,int[]sub){
        int n=arr.length;
        int m=sub.length;
        for(int i=0;i<=n-m;i++){
          int j=0;
          while(j<m && arr[i+j]==sub[j]){
            j++;
          }
          if(j==m) return true;
        }
        return false;

    }

    public boolean check(int[] nums) {
        int n=nums.length;
        int[] nums2=nums.clone();
        Arrays.sort(nums2);
        int[] nums3=new int[n+n];
        int i=0;
        for(i=0;i<n;i++ ){
            nums3[i]=nums[i];

        }
        int j=0;
        while(i<n+n && j<n){
            nums3[i]=nums[j];
        i++;j++;
        }

        boolean ans=containsSubarray(nums3,nums2);

       return ans;

        

        
    }
}