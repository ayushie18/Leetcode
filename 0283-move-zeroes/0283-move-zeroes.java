class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
    //   int nonZeroes=0;
    //   for(int i=0; i<n;i++){
    //     if(nums[i]!=0){
    //         nums[nonZeroes]=nums[i];
    //         nonZeroes++;
    //     }
    //   }
    //   while(nonZeroes<n){
    //     nums[nonZeroes]=0;
    //     nonZeroes++;
    //   }

    Stack<Integer> st=new Stack<>();
    int cnt=0;
    
    for(int i:nums){
      if(i!=0){
        st.push(i);
        cnt++;

      }
    }
    int j=cnt-1;
     while(!st.isEmpty()){
         nums[j--]=st.pop();
     }
    
 
   for(int c=cnt;c<n;c++){
    nums[c]=0;
   }

    
  }
}