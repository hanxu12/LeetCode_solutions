//338. Counting bits, dp+msb, O(n)
//there is a pattern
class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        int i = 0;
        int base = 1;
        //base meaning, 1, 2, 4, 8, 16, ...,2^n
        while (base <= num){
        	while (i < base && i + base <= num){
        		res[i + base] = res[i] + 1;
        		i++;
        	}
        	i = 0;
        	base = 2 * base;
        }
        return res;
    }
}