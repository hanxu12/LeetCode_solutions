//235. Lowest Common Ancestor of a Binary Search Tree, Recursion, Use BST property
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	int parentVal = root.val;
    	int pVal = p.val;
    	int qVal = q.val;

    	if (pVal > parentVal && qVal > parentVal) {
    		return lowestCommonAncestor(root.right, p, q);
    	} else if (pVal < parentVal && qVal < parentVal) {
    		return lowestCommonAncestor(root.left, p, q);
    	} else {
    		return root;
    	}
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */