class Solution {
    // public String findDifferentBinaryString(String[] nums) {
    //     int n=nums.length;
    //     String ans="";
    //     for(int i=0;i<n;i++){
    //         if(nums[i].charAt(i)=='0'){
    //             ans+="1";
    //         }
    //         else{
    //             ans+="0";
    //         }

    //     }
    //    return ans; 
    // }
       public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        
        HashSet<String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
        
        int total = 1 << n;   // 2^n possibilities
        
        for(int i = 0; i < total; i++){
            String bin = Integer.toBinaryString(i);
            
            // pad with leading zeros to make length n
            while(bin.length() < n){
                bin = "0" + bin;
            }
            
            if(!set.contains(bin)){
                return bin;
            }
        }
        
        return "";
    }
}