//73. Set Matrix Zeroes, HashSet, O(n)
class Solution {
    public void setZeroes(int[][] matrix) {
        int row_len = matrix.length;
        int col_len = matrix[0].length;
        Set<Integer> memRow = new HashSet<>();
        Set<Integer> memCol = new HashSet<>();

        for (int i = 0; i < row_len; i++){
        	for (int j = 0; j < col_len; j++){
        		if (matrix[i][j] == 0){
        			memRow.add(i);
        			memCol.add(j);
        		}
        	}
        }

        for (int i = 0; i < row_len; i++){
        	for (int j = 0; j < col_len; j++){
        		if (memRow.contains(i) || memCol.contains(j)) {
        			matrix[i][j] = 0;
        		}
        	}
        }
    }
}