//572. Subtree of Another Tree, O(m * n)
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return traverse(s, t);
    }

    public boolean equals(TreeNode n1, TreeNode n2) {
    	if (n1 == null && n2 == null) {
    		return true;
    	}
    	if (n1 == null || n2 == null) {
    		return false;
    	}
    	else if (n1.val != n2.val) {
    		return false;
    	}
    	return equals(n1.left, n2.left) && equals(n1.right, n2.right);
    }

    public boolean traverse(TreeNode s, TreeNode t) {
    	if (s == null) {
    		return false;
    	}
    	return equals(s, t) || traverse(s.left, t) || traverse(s.right, t);
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