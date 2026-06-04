class Solution {
    public int countWaviness(int n){
        int count=0;
        if(n<=99) return 0;
        ArrayList<Integer>arr=new ArrayList<>();
        int temp=n;
        while(temp>0){
            int dig=temp%10;
            arr.add(dig);
            temp/=10;

        }
        Collections.reverse(arr);
        for(int i=1;i<arr.size()-1;i++){
           
            if((arr.get(i)>arr.get(i+1)) && (arr.get(i)>arr.get(i-1))){
                count++;
            }
             if((arr.get(i)<arr.get(i+1)) && (arr.get(i)<arr.get(i-1))){
                count++;
            }
        }
        
         return count;

    }
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=countWaviness(i);
        }
        return ans;
        
    }
}