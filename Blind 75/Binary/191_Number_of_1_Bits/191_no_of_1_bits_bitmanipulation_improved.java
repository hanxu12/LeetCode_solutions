//191. Number of 1 Bits, bit_manipulation, improved , O(1)
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0){
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }

}