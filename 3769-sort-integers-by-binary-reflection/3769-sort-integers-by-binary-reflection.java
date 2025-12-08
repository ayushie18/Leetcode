class Solution {
    public int[] sortByReflection(int[] nums) {
        int n=nums.length;
        List<int[]>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int mynum=nums[i];
            int rev=0;
            while(mynum>0){
                int rem=mynum%2;
                rev=rev*2+rem;
                mynum/=2;
            }
           list.add (new int[]{nums[i],rev});
            
        }

        Collections.sort(list,(a,b)->{
            if(a[1]!=b[1]) return a[1]-b[1];
            return(a[0]-b[0]);
        });
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=list.get(i)[0];
        }

        
        return ans;
        
    }
}