//102. Binary Tree Level Order Traversal, Recursion, O(N)
class Solution {
	List<List<Integer>> levels = new ArrayList<List<Integer>>();

	private void helper(TreeNode node, int level) {

		if (levels.size() == level) {
			levels.add(new ArrayList<Integer>());
		}

		levels.get(level).add(node.val);

		if (node.left != null) {
			helper(node.left, level + 1);
		}
		if (node.right != null) {
			helper(node.right, level + 1);
		}
	}

    public List<List<Integer>> levelOrder(TreeNode root) {
    	if (root == null) {
    		return null;
    	}    
    	helper(root, 0);
    	return levels;
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