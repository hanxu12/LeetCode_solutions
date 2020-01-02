//371. Sum of 2 Ints(cannot use +/-), software adder(use XOR + ADD)
class Solution {
    public int getSum(int a, int b) {
    	while (b != 0){
    		//this give a temporary carry 
    		int temp_carry = a & b;
    		//temp addition result
    		a = a ^ b;
    		b = temp_carry << 1;
    	}
    	return a;
    }
}