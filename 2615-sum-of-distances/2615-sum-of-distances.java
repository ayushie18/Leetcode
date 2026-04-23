class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long [] arr=new long[n];
        HashMap<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);

            }
            else{
            List<Integer> idx=new ArrayList<>();
            idx.add(i);
            map.put(nums[i],idx);
            }
        }
        for(int ele:map.keySet()){
           List<Integer>list=map.get(ele); 
           int size= list.size();
           if(size>1){
            long total=0;
            for(int i=0;i<size;i++){
                total+=list.get(i);
            }
            long prefix=0;
            for(int i=0;i<size;i++){
                int pos=list.get(i);
                long left=(long)pos*i-prefix;
                long right=(total-prefix-pos)-(long)pos*(size-i-1);
                arr[pos]=left+right;
                prefix+=pos;
            }
           }
           
        }
     
        return arr;
     }
}