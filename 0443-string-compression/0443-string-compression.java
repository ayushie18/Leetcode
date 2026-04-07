class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int j=0;
        for(int i=0;i<n;i++){
            int count=1;
            char curr=chars[i];
            while(i<n-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }

            chars[j++]=curr;
            if(count>1){
                 String c=String.valueOf(count);
                 for(char ch:c.toCharArray()){
                    chars[j++]=ch;
                 }

                
            }
     }
        return j;
        
    }
}