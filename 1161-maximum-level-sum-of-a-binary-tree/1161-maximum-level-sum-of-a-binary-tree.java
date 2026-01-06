/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        int maxsum=Integer.MIN_VALUE;
        int level=0;
        int anslevel=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();
            int sum=0;
            level++;
            for(int i=0;i<n;i++){
                TreeNode curr=q.remove();
                sum+=curr.val;

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }

           // maxsum=Math.max(sum,maxsum);
           if(sum>maxsum){
            maxsum=sum;
            anslevel=level;
           }

        }
       return anslevel; 
    }
}