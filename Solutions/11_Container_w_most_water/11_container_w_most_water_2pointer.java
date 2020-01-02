//11. Container with most water, , 2 pointers, O(n)
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;

        int maxArea = 0;
        while (left < right){
            maxArea = Math.max((right - left) * Math.min(height[left], height[right]), maxArea);
            if (height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }
            
        }
        return maxArea;
    }
}