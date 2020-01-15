//100. Same Tree, Stack, O(N)
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();

        pStack.add(p);
        qStack.add(q);

        while (!pStack.isEmpty()) {
            TreeNode pNode = pStack.pop();
            TreeNode qNode = qStack.pop();

            if (pNode == null && qNode == null) {
                continue;
            } else if (pNode == null || qNode == null) {
                return false;
            } else if (pNode.val != qNode.val) {
                return false;
            }

            pStack.push(pNode.left);
            pStack.push(pNode.right);
            qStack.push(qNode.left);
            qStack.push(qNode.right);
        }
        return true; 
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