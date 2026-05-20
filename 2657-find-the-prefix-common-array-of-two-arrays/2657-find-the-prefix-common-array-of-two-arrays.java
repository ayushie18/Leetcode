class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int[] ans= new int[A.length];
        HashSet<Integer>  setA= new HashSet<>();
        HashSet<Integer> setB= new HashSet<>();
        int count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B[i]){
                count++;
            }
            else{

            if(setA.contains(B[i])){
                count++;
            }

            if(setB.contains(A[i])){
                count++;
            }
            }
            setA.add(A[i]);
            setB.add(B[i]);

            ans[i]=count;


       }
       return ans;
              
    }
}