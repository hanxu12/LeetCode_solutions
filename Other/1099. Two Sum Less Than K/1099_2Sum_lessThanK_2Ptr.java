//1099. Two Sum Less Than K, 2 Ptr
class Solution {
    public int twoSumLessThanK(int[] A, int K) {
        int max = -1;
        Arrays.sort(A);
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            int sum = A[left] + A[right];
            if (sum >= K) {
                right -= 1;
            } else {
                max = Integer.max(sum, max);
                left += 1;
            }
        }
        return max;
    }
}