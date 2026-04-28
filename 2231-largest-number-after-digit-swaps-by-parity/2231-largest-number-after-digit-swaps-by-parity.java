class Solution {
    public int largestInteger(int num) {
        char [] arr=Integer.toString(num).toCharArray();
        for(int i=0;i<arr.length;i++){
            int maxPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[maxPos] &&(arr[j]-arr[i])%2==0){
                    maxPos=j;
                }
            }
        char temp=arr[i];
        arr[i]=arr[maxPos];
        arr[maxPos]= temp;

        }

    return Integer.parseInt(new String(arr));
        
    }
}