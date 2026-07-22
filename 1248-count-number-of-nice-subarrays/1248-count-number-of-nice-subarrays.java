class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]%=2;
        }

        int count=0;
        int preSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
           preSum+=arr[i];

           if(preSum==k)count++;

           if(map.containsKey(preSum-k)){
              count+=map.get(preSum-k);
           }
           map.put(preSum,map.getOrDefault(preSum,0)+1);

        }
        return count;

        
    }
}