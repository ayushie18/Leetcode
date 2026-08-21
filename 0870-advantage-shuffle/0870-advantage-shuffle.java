class Solution {
    class Pair{
        int idx;
        int val;
        Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
    }
    public int[] advantageCount(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        int n=nums1.length;

        Pair[] num2=new Pair[n];
        for(int i=0;i<n;i++){
            num2[i]=new Pair(i,nums2[i]);
          
        }

        Arrays.sort(num2,(a,b)->Integer.compare(b.val,a.val));

        int[] ans=new int[n];
        int left=0;
        int right=nums1.length-1;

        for(Pair p:num2){
            if(nums1[right]>p.val){
                ans[p.idx]=nums1[right];
                right--;
            }
            else{
                ans[p.idx]=nums1[left];
                left++;
            }
        }
        return ans;
        
    }
}