class Solution {
    public void reverse(int[] nums, int start, int end){
        int i=start;
        int j=end;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
       
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){// breaking point 
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){// edge case like (3,2,1)--> reverse in asc order acc to ques
            reverse(nums,0,n-1);
            return;
        }
        // Now we swap the pivot to next greater element
        //(1 3 6 5 4)
        //(1 4 6 5 3)-> after swapping
        //      ..... still largest
        // hence reverse from idx pivot+1 to end
        //(1 4 3 5 6)-> next greater elemnt

        for(int i=nums.length-1;i>pivot;i--){// swapping of pivot ele and next greater ele
            if(nums[i]>nums[pivot]){
                int temp=nums[pivot];
                nums[pivot]=nums[i];
                nums[i]=temp;
                break;
            }
        }

        reverse(nums,pivot+1,n-1);// reverse


    }
}