class Solution {
   // public int countWaviness(int n){
     //   int count=0;
        // if(n<=99) return 0;
        // ArrayList<Integer>arr=new ArrayList<>();
        // int temp=n;
        // while(temp>0){
        //     int dig=temp%10;
        //     arr.add(dig);
        //     temp/=10;

        // }
        // Collections.reverse(arr);
    //     String arr=
    //     for(int i=1;i<arr.size()-1;i++){
           
    //         if((arr.get(i)>arr.get(i+1)) && (arr.get(i)>arr.get(i-1))){
    //             count++;
    //         }
    //          if((arr.get(i)<arr.get(i+1)) && (arr.get(i)<arr.get(i-1))){
    //             count++;
    //         }
    //     }
        
    //      return count;

    // }
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            String s1=String.valueOf(i);
            for(int j=1;j<s1.length()-1;j++){
                int count=0;
                   
            if(((s1.charAt(j)-'0')>(s1.charAt(j+1)-'0')) && ((s1.charAt(j)-'0')>(s1.charAt(j-1)-'0'))){
                count++;
            }
            if(((s1.charAt(j)-'0')<(s1.charAt(j+1)-'0')) && ((s1.charAt(j)-'0')<(s1.charAt(j-1)-'0'))){
                count++;
            }
            ans+=count;


            }

    }
        return ans;
        
    }
}