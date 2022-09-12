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
    public boolean isSymmetric(TreeNode root) {
        return root==null || is(root.left,root.right);
      }
    static boolean is(TreeNode l,TreeNode r){
        if(l==null || r==null) return l==r;   // so if(l==null) then r==null to make them symmetrical and vice versa
        if(l.val!=r.val) return false;    // check if the left node and right node val are equal if not then return false
        return is(l.left,r.right) && is(l.right,r.left);   // then check left of the left node and right of right node are equal or not and    //similarly for right of left node and left of right node are equal . if both yes the return yes 
      }    
}