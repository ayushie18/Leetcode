class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=2*nums.length-1; i>=0;i--){
            int num=nums[i%nums.length];
            while(!st.isEmpty() && st.peek()<=num){
                st.pop();
            }
            if(i<nums.length){
                if(!st.isEmpty()){
                    ans[i]=st.peek();
                }
            }
             st.add(num);
        }
        return ans;
   }
}