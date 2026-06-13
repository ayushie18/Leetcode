class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        String ans="";
        char[] arr={'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};

        for(int i=0;i<n;i++){
            String s=words[i];
            int sum=0;
            for(int j=0;j<s.length();j++){
                int idx=s.charAt(j)-'a';
                sum+=weights[idx];
            }
            int val=sum%26;
            ans+=arr[val];  
            

        }
        return ans;
    }
}