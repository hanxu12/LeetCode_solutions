//191. Number of 1 Bits, Loop & Flip/Bit mask , O(1)
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt = 0;
        int bit_mask = 1;
        for (int i = 0; i < 32; i++){
            if ((n & (bit_mask)) != 0) {
                cnt++;
            }
            bit_mask = bit_mask << 1;
        }
        return cnt;
    }

}