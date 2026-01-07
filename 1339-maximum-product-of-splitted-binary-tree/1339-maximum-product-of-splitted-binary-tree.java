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
    long maxProd=0;
    long SUM=0;
    public long totalSum(TreeNode root){
        if(root==null) return 0;
        long sumLeft=totalSum(root.left);
        long sumRight=totalSum(root.right);

        long Sum=root.val+ sumLeft+sumRight;
       

        return Sum;

    }
    public long findSum(TreeNode root){
        if(root==null) return 0;
        long sumLeft=findSum(root.left);
        long sumRight=findSum(root.right);

        long SubTreeSum=root.val+ sumLeft+sumRight;

        long remSubTreeSum=SUM-SubTreeSum;
        maxProd=Math.max(maxProd,SubTreeSum*remSubTreeSum);

        return SubTreeSum;

    }
    public int maxProduct(TreeNode root) {
        if(root==null) return 0;
        maxProd=0;
        SUM=totalSum(root);
        findSum(root);

        return (int)maxProd%1000000007;
   }
}