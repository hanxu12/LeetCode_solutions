// 54. Spiral Matrix , Needs to fix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowMin = 0;
        int rowMax = matrix.length;
        int colMin = 0;
        int colMax = matrix[0].length;
        //int[] res = new int[rowMax * colMax];
        List res = new ArrayList();

        int row = 0, col = 0;
        int strategy = 0;
        for (int i = 0; i < rowMax * colMax; i++) {
        	//if needs to go right
        	if (strategy == 0) {
        		while (col < colMax) {
        			res.add(matrix[row][col]);
        			col += 1;
        		}
        		strategy += 1;
        		colMax -= 1;
                col -=1;
        		//if needs to go btm
        	} else if (strategy == 1) {
        		while (row < rowMax) {
        			res.add(matrix[row][col]);
        			row += 1;
        		}
        		strategy += 1;
        		rowMax -= 1;
        		row -= 1;
        	} else if (strategy == 2){
        		while (col > colMin) {
        			res.add(matrix[row][col]);
        			col -= 1;
        		}
        		strategy += 1;
        		colMin += 1;   
        		col += 1;     		
        	} else{
        		while (row > rowMin) {
        			res.add(matrix[row][col]);
        			row -= 1;
        		}
        		strategy = 0;
        		rowMin += 1;    
        		row += 1;    		
        	}
        }
        return res;
    }
}