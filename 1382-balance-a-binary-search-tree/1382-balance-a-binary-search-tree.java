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
    public void inorder(TreeNode root,List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public TreeNode helper(List<Integer> arr, int lo, int hi){
        if(lo>hi) return null;
        int mid=lo+(hi-lo)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=helper(arr,lo,mid-1);
        root.right=helper(arr,mid+1,hi);
        return root;
    }

 public TreeNode balanceBST(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        int n=arr.size();
        return helper(arr,0,n-1);
        
    }
}