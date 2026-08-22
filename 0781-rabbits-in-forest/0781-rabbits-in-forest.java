class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int a:answers){
            map.put(a+1,map.getOrDefault(a+1,0)+1);
        }
        int ans=0;
        for(int key:map.keySet()){
            int freq=map.get(key);
            int q=freq/key;
            int r=freq%key;
            ans+=key*q;
            if(r>0){
                ans+=key;
            }
        }
        return ans;

        
    }
}