class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        boolean[] vis=new boolean[v];
         int count=0;
         for(int i=0;i<v;i++){
            if(!vis[i]){
                bfs(i,isConnected,vis);
                count++;
            }
         }
         return count;
    }     

    public void bfs(int node,int[][]isConnected,boolean[]vis){
        int n=isConnected.length;
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        vis[node]=true;
       
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int front=q.poll();
            ans.add(front);
            

            for(int j=0;j<n;j++){
             if(isConnected[front][j]==1 && vis[j]==false){
                q.add(j);
                vis[j]=true;
             }
            }
        }
    }    
    

  
}