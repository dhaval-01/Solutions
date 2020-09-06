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

//https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/554/week-1-september-1st-september-7th/3449/

    List<Integer> ans=new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Trav(root1);
        Trav(root2);
        Collections.sort(ans);
        return ans;
    }
    public void Trav(TreeNode root)
    {
        if(root==null)
            return;
        else
        {
            ans.add(root.val);
            Trav(root.left);
            Trav(root.right);
        }
    }
}
