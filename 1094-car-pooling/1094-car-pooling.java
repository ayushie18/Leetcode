class Solution {
    Map<Integer,Integer> map=new TreeMap<>();
    public boolean carPooling(int[][] trips, int capacity) {
        for(int [] ele:trips){
            int pass=ele[0];
            int start=ele[1];
            int end=ele[2];

            map.put(start,map.getOrDefault(start,0)+pass);
            map.put(end,map.getOrDefault(end,0)-pass);
        }
        int passengers=0;
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
        passengers=passengers+entry.getValue();
        if(passengers>capacity){
            return false;
        }
        }
        return true;

        
    }
}