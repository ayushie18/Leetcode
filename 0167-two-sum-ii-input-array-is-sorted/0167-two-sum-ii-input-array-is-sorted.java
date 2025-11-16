class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int[]arr=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int i=0,j=n-1;
        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else {
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
        }

       return arr; 
    }
}