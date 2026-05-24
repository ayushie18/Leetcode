class Task{
    char taskName;
    int freq;
    int nextExecTime;

    public Task(char taskName,int freq,int nextExecTime){
        this.taskName=taskName;
        this.freq=freq;
        this.nextExecTime=nextExecTime;

    }

}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            char c=tasks[i];
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Task> maxHeap=new PriorityQueue<>((a,b)->{
            if(b.freq==a.freq){
                return(a.nextExecTime-b.nextExecTime);
            }
            return(b.freq-a.freq);
        }
        );

        Queue<Task> q=new LinkedList<>();

        for(char key:map.keySet()){
            maxHeap.add(new Task(key,map.get(key),0));
        }

        ArrayList<Character> ans=new ArrayList<>();
        int time=0;
        while(!maxHeap.isEmpty() || !q.isEmpty()){
           time++;
           while(!q.isEmpty() && q.peek().nextExecTime==time){
             maxHeap.add(q.poll());
           }
           if(!maxHeap.isEmpty()){
             Task curr=maxHeap.poll();
             ans.add(curr.taskName);
             int f=curr.freq-1;
            if(f>0){
                q.add(new Task(curr.taskName,f,time+n+1));
            }
           }
        } 
        System.out.print(ans); 
        return time;
        
    }
}