class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> arr=new ArrayList<>();
        for(int ele:nums){
            arr.add(String.valueOf(ele));
        }
        Collections.sort(arr,(a,b)->(b+a).compareTo(a+b));

        if (arr.get(0).equals("0")) return "0";

        String ans="";
        for(int i=0;i<nums.length;i++){
        ans+=arr.get(i);

        }
       
        return ans;
    }
}