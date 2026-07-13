class Solution {
    public boolean isSeq(int n){
       String s=String.valueOf(n);
       for(int i=1;i<s.length();i++){
        if(s.charAt(i)-s.charAt(i-1)!=1){
            return false;
        }
       }
       return true;

    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        // for(int i=low;i<=high;i++){
        //     if(isSeq(i)){
        //         ans.add(i);
        //     }
        // }
        // String digits = "123456789";
        // for (int len = 2; len <= 9; len++) {
        //     for (int i = 0; i + len <= 9; i++) {
        //         int num = Integer.parseInt(
        //             digits.substring(i, i + len)
        //         );

        //         if (num >= low && num <= high) {
        //             ans.add(num);
        //         }
        //     }
            
        // }
        // Collections.sort(ans);
        // return ans;
        for(int i=1;i<=9;i++){
            int n=i;
            int nextDig=i+1;
            while(n<=high && nextDig<=9){
              n=n*10+nextDig;
              if(low<=n && n<=high){
                ans.add(n);
              }
              nextDig++;
            }
        } 
       Collections.sort(ans);  
       return ans;

   }
}