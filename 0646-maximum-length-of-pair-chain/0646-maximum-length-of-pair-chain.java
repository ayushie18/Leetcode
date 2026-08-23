class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        List<int[]>arr=new ArrayList<>();
        arr.add(pairs[0]);
        for(int i=1;i<pairs.length;i++){
            int[] curr=pairs[i];
            if(curr[0]>arr.get(arr.size()-1)[1]){
                arr.add(curr);
            }
        }

        return arr.size();

        
    }
}