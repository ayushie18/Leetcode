class Solution {
    public int countTrapezoids(int[][] points) {
        int mod=1000000007;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int[] ele:points){
            int y=ele[1];
            map.put(y,map.getOrDefault(y,0)+1);
        }
        long result=0;
        long prevHorizontalLines=0;
        TreeMap<Integer,Integer> tree=new TreeMap<>(map);
        for(int i: tree.values() ){
            long horizontalLines=((long)i*(i-1)/2%mod);
            result=(result+horizontalLines*prevHorizontalLines)%mod;
            prevHorizontalLines=(prevHorizontalLines+horizontalLines)%mod;
        }
        return  (int)(result%mod);
        
    }
}