//11. Container with most water, brute force, O(n^2)
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = Math.min(height[0], height[1]);
        for (int i = 0; i < n; i++){
        	for (int j = i + 1; j < n; j++){
        		maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
        	}
        }
        return maxArea;
    }
}