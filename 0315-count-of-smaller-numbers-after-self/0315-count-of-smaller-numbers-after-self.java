class Solution {
    int[] ans;
    class Number{
        int val;
        int idx;
        Number(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
    }
    
    public void countInversion(Number [] a,Number[] b){
        int i=0;
        int j=0;
        int rightCount=0;
        while(i<a.length && j<b.length){
           if(a[i].val>b[j].val){
              rightCount++;
              j++;
           }
           else{
            ans[a[i].idx]+=rightCount;
            i++;
           }
        }
        while(i<a.length){
            ans[a[i].idx]+=rightCount;
            i++;
        }
        
    }
    public void merge(Number[] nums,Number [] a,Number[]b){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length ){
            if(a[i].val<=b[j].val){
                nums[k++]=a[i++];
            }
            else{
                nums[k++]=b[j++];
            }
        }
        while(i<a.length) nums[k++]=a[i++];
        while(j<b.length) nums[k++]=b[j++];


    }
    public void mergeSort(Number[] nums){
        int n=nums.length;
        if(n<=1) return ;
     
        Number [] a=new Number[n/2];
        Number [] b=new Number[n-n/2];

        for(int i=0;i<n/2;i++){
            a[i]=nums[i];
        }

        for(int j=0;j<n-n/2;j++){
            b[j]=nums[j+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        countInversion(a,b);
        merge(nums,a,b);
    }
    public List<Integer> countSmaller(int[] nums) {
      int n=nums.length;
        ans=new int[n];
      Number[] arr=new Number[n];
      for(int i=0;i<n;i++){
        arr[i]=new Number(nums[i],i);
      }

      mergeSort(arr);

      ArrayList<Integer> res=new ArrayList<>();
      for(int i=0;i<ans.length;i++){
       res.add(ans[i]);
      }
      
      
      return res;
    }
}