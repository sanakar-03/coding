class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        // To remember whether first row or first column
        // originally contained a zero
        boolean firstRow = false;
        boolean firstCol = false;

        // Check if first column contains any zero
        for (int r = 0; r < row; r++) {
            if (matrix[r][0] == 0) {
                firstRow = true;
                break;
            }
        }

        // Check if first row contains any zero
        for (int c = 0; c < col; c++) {
            if (matrix[0][c] == 0) {
                firstCol = true;
                break;
            }
        }

        // Use first row and first column as markers
        for (int r = 1; r < row; r++) {
            for (int c = 1; c < col; c++) {

                if (matrix[r][c] == 0) {

                    // Mark this row
                    matrix[r][0] = 0;

                    // Mark this column
                    matrix[0][c] = 0;
                }
            }
        }

        // Make marked rows zero
        for (int r = 1; r < row; r++) {

            if (matrix[r][0] == 0) {

                for (int c = 1; c < col; c++) {
                    matrix[r][c] = 0;
                }
            }
        }

        // Make marked columns zero
        for (int c = 1; c < col; c++) {

            if (matrix[0][c] == 0) {

                for (int r = 1; r < row; r++) {
                    matrix[r][c] = 0;
                }
            }
        }

        // If first column originally had a zero,
        // make entire first column zero
        if (firstRow) {
            for (int r = 0; r < row; r++) {
                matrix[r][0] = 0;
            }
        }

        // If first row originally had a zero,
        // make entire first row zero
        if (firstCol) {
            for (int c = 0; c < col; c++) {
                matrix[0][c] = 0;
            }
        }
    }
}