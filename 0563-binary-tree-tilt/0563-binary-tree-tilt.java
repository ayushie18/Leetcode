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
    int ans=0;
    public int postOrder(TreeNode root){
        if(root==null) return 0;
        int leftSum=postOrder(root.left);
        int rightSum=postOrder(root.right);
        int tilt=Math.abs(leftSum-rightSum);
        ans+=tilt;

        return leftSum+rightSum+root.val;

    }
    public int findTilt(TreeNode root) {
        postOrder(root);
        return ans;
        
    }
}