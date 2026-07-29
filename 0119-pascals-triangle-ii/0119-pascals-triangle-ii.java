class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> arr=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){// 1st and last ele is always 1 
                    arr.add(1);
                }
                else{
                    arr.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
                
            }
            ans.add(arr);
        }

        return ans.get(rowIndex);    
        
    }
}