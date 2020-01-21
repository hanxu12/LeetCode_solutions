//230. Kth Smallest Element in a BST, Inorder traversal, O(n)
class Solution {
	private ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
		if (root == null) {
        	return arr;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
	}
    public int kthSmallest(TreeNode root, int k) {
    	ArrayList<Integer> res = inorder(root, new ArrayList<Integer>());
    	return res.get(k-1);
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