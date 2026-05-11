class Solution {
    public ArrayList<Integer> helper(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>9){
            int dig=n%10;
            arr.add(dig);
            n=n/10;
        }
        arr.add(n);

        Collections.reverse(arr);
        
        return arr;

    } 
    public int[] separateDigits(int[] nums) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                ans.add(helper(nums[i]));
            }
            else{
                ArrayList<Integer> aa=new ArrayList<>();
                aa.add(nums[i]);
                  ans.add( aa);  
            }
        }

        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            if(ans.get(i).size()>1){
                for(int j=0;j<ans.get(i).size();j++){
                    result.add(ans.get(i).get(j));
                }
            }
            else result.add(ans.get(i).get(0));
        }
        
        int[] res=new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i]=result.get(i);
        }
        return res;
        
    }
}