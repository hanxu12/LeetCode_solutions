//48. Rotate Image, Transpose (flips a matrix over its diagonal) & Reverse, O(n^2)
class Solution {
    public void rotate(int[][] matrix) {
    	int rowLen = matrix.length;
    	int colLen = matrix[0].length;
    	//traspose the matrix
        for (int i = 0; i < rowLen; i++) {
        	for (int j = 0; j < i; j++){
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[j][i];
        		matrix[j][i] = temp;
        	}
        }
        //invert each row
        for (int i = 0; i < rowLen; i++) {
        	for (int j = 0; j < colLen/2; j++){
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[i][colLen-j-1];
        		matrix[i][colLen-j - 1] = temp;
        	}
        }
    }
}