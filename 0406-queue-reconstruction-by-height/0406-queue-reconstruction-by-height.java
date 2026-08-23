class Solution {
    public int[][] reconstructQueue(int[][] people) {
        List<int[]> ans=new ArrayList<>();  
        Arrays.sort(people,(a,b)->{
        int val=b[0]-a[0];
        if(val==0){
            return  a[1]-b[1];
        }
        return b[0]-a[0];
        });

        for(int[] p:people){
            ans.add(p[1],p);
             
        }

        int [][] res=new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }

        return res;
        
    }
}