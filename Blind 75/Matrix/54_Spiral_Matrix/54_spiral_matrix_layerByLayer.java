//54. Spiral Matrix, Layer-by-Layer, O(n)
class Solution {
    public List < Integer > spiralOrder(int[][] matrix) {
        List res = new ArrayList();
        if (matrix.length == 0)
            return res;
        int rowMin = 0, rowMax = matrix.length - 1;
        int colMin = 0, colMax = matrix[0].length - 1;
        while (rowMin <= rowMax && colMin <= colMax) {
            for (int c = colMin; c <= colMax; c++){
                res.add(matrix[rowMin][c]);
            }
            for (int r = rowMin + 1; r <= rowMax; r++){
                res.add(matrix[r][colMax]);
            }
            if (rowMin < rowMax && colMin < colMax) {
                for (int c = colMax - 1; c > colMin; c--){
                    res.add(matrix[rowMax][c]);
                }
                for (int r = rowMax; r > rowMin; r--){
                    res.add(matrix[r][colMin]);
                }
            }
            rowMin += 1;
            rowMax -= 1;
            colMin += 1;
            colMax -= 1;
        }
        return res;
    }
}