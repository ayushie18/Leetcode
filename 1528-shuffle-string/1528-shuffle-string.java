class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        char [] arr=new char[n];

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=indices[i];
            arr[idx]=ch;


        }

        String ans= new String(arr);

        return ans;
        
    }
}