class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }
            else{
                ArrayList<Integer> idx=new ArrayList<>();
                idx.add(i);
                map.put(arr[i],idx);
            }
        }
        boolean[] visited=new boolean[n];

        Queue<Integer>queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;

        int steps=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                int curr=queue.peek();
                queue.poll();
                int left=curr-1;
                int right=curr+1;
                if(curr==n-1) return steps;
                if(left>=0 && !visited[left]){
                    queue.add(left);
                    visited[left]=true;
                }
                if(right<=n-1 && !visited[right]){
                    queue.add(right);
                    visited[right]=true;
                }
                if(map.containsKey(arr[curr])){
                for(int idx : map.get(arr[curr])){
                    if(!visited[idx]){
                        queue.add(idx);
                        visited[idx]=true;
                    }
                }
                map.remove(arr[curr]);
                }
                
            }
            steps++;
        }
        return -1;
   }
}