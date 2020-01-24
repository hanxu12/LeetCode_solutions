/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public boolean isBSTHelper(TreeNode node, long lowerLimit, long upperLimit) {
		if (node == null) {
			return true;
		}
		int val = node.val;
		if (val <= lowerLimit || val >= upperLimit) {
			return false;
		}
		return isBSTHelper(node.left, lowerLimit, val) && isBSTHelper(node.right, val, upperLimit);
	}
    public boolean isValidBST(TreeNode root) {
    	return isBSTHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}