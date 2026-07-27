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
    List<Integer> a=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode r){
        f(r);
        return a;
    }
    void f(TreeNode r){
        if(r==null)return;
        f(r.left);
        a.add(r.val);
        f(r.right);
    }
}