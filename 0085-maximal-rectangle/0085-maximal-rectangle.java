class Solution {
    public int largestRecArea(int[] heights){
        int n=heights.length;
        int maxA=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<=n;i++){
            int currheight=(i==n)?0:heights[i];
        
        while(!s.isEmpty() && currheight<heights[s.peek()]){
            int height=heights[s.pop()];
            int right=i;
            int left=s.isEmpty()?-1:s.peek();
            int width=right-left-1;

            maxA=Math.max(maxA,height*width);
        }
        s.push(i);
        }
        return maxA;
    }
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int maxArea=0;
        int [] hgt=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1') hgt[j]++;
                else{
                  hgt[j]=0;
                }
            }
            int area=largestRecArea(hgt);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
        
    }
}