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
    int maxProd=0;
    int SUM=0;
    public int totalSum(TreeNode root){
        if(root==null) return 0;
        int sumLeft=totalSum(root.left);
        int sumRight=totalSum(root.right);

        int Sum=root.val+ sumLeft+sumRight;
       

        return Sum;

    }
    public int findSum(TreeNode root){
        if(root==null) return 0;
        int sumLeft=findSum(root.left);
        int sumRight=findSum(root.right);

        int SubTreeSum=root.val+ sumLeft+sumRight;

        int remSubTreeSum=SUM-SubTreeSum;
        maxProd=Math.max(maxProd,SubTreeSum*remSubTreeSum);

        return SubTreeSum;

    }
    public int maxProduct(TreeNode root) {
        if(root==null) return 0;
        maxProd=0;
        SUM=totalSum(root);
        findSum(root);

        return (maxProd%1000000007);
   }
}