//153. Find Minimum in Rotated Sorted Array, Binary Search, O(logn)

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        //edge case;
        if (n == 1){
        	return nums[0];
        }
        //edge case
        if (nums[n-1] > nums[0]){
        	return nums[0];
        }
        //modified binary search
        int left = 0;        
        int right = n-1;

        while (right >= left){
        	int mid = left + (right - left)/2;

        	if (nums[mid] > nums[mid + 1]){
        		return nums[mid + 1];
        	}
        	if (nums[mid - 1] > nums[mid]){
        		return nums[mid];
        	}


        	if (nums[mid] > nums[0]){
        		left = mid + 1;
        	}else {
        		right = mid - 1;
        	}
        }
        return -1;
    }
}