//15. 3Sum, HashSet, O(n^2)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        //use a cacheTriplet to store to b/c access complexity = O(1)
        Set<List<Integer>> cacheTriplet = new HashSet<>();
        Set<Integer> cache = new HashSet<>();

        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                int n1 = nums[i];
                int n2 = nums[j];
                int complement = -n1 - n2;

                if (cache.contains(complement)){
                    //better than adding 1 by 1
                    List<Integer> tempTriplet = Arrays.asList(n1, n2, complement);

                    //List<Integer> tempTriplet = new ArrayList();
                    //tempTriplet.add(n1);
                    //tempTriplet.add(n2);
                    //tempTriplet.add(complement);

                    if (!cacheTriplet.contains(tempTriplet)){
                        res.add(tempTriplet);
                        cacheTriplet.add(tempTriplet);
                    }
                } 
            }
            cache.add(nums[i]);
        }
        return res;
    }
}