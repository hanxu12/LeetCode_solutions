//190. Reverse Bits, getBit/setBit method, O(1)
public class Solution {
	public int reverseBits(int n){
		int res = 0;
		for (int i = 0; i < 32; i++){
			if (getBit(n, i)){
				res = setBit(res, 31 - i);
			}
		}
		return res;
	}
	//get a specific bit from the original int
	private boolean getBit(int n, int bit){
		return (n & (1 << bit)) != 0;
	}
	//set the desired bit to result int
	private int setBit(int n, int bit){
		return (n | (1 << bit));
	}
}

