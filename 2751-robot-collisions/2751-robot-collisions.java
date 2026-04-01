class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
     int n=positions.length;   
    
     int[][] arr=new int[n][4];

     for(int i=0;i<arr.length;i++){
         arr[i][0]=positions[i];
         arr[i][1]=healths[i];
         arr[i][2]=directions.charAt(i);
         arr[i][3]=i;
     }

     Arrays.sort(arr,(a,b)->a[0]-b[0]);

     Stack<int[]> st=new Stack<>();

     for(int[] ele:arr){
        if(ele[2]=='R'){
            st.push(ele);
        }
        else{
            while(!st.isEmpty() &&  st.peek()[2]=='R'){
            if(st.peek()[1]> ele[1]){
                st.peek()[1]--;
                ele[1]=0;
                break;
            }
            else if(st.peek()[1]<ele[1]){
               st.pop();
               ele[1]--;
            }
            else{
                st.pop();
                ele[1]=0;
                break;
            }
            }
            if(ele[1]>0){
            st.push(ele);
        }
        }

        
     }

     List<int[]> survivers=new ArrayList<>(st);
     survivers.sort((a,b)->a[3]-b[3]);

      List<Integer> ans=new ArrayList<>();
    for(int i=0;i<survivers.size();i++){
        ans.add(survivers.get(i)[1]);
    }  

return ans;


   }
}