class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        

        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i];
        }
        Arrays.sort(ans);

        int rank=1;
        for(int i=0;i<arr.length;i++){
           if(!map.containsKey(ans[i])){
                map.put(ans[i],rank);
                rank++;
            }
            
        }
        for(int i=0;i<arr.length;i++){
           // if(map.containsKey(arr[i])){
              ans[i]=map.get(arr[i]);
            
        }

    return ans;
        
    }
}