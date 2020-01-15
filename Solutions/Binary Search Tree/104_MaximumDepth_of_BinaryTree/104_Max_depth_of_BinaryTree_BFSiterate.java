//104. Maximum Depth of Binary Tree, BFS
class Solution {
    public int maxDepth(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	Deque<TreeNode> dq = new ArrayDeque<>();
    	int depth = 0, next = 0;
    	TreeNode curr;
    	dq.offer(root);

    	while (!dp.isEmpty()) {
    		depth += 1;
    		next = dq.size();
    		for (int i = 0; i < next; i++) {
    			curr = dq.poll();
    			if (curr.left != null) {
    				dp.offer(curr.left);
    			}
    			if (curr.right != null) {
    				dp.offer(curr.right);
    			}
    		}
    		return depth;
    	}
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