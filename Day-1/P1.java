// Brute Force Sol(works only if only positive numbers,more precisely, any number other than '-1' is filled since we are using -1 as flag to enter 0s later)
class Solution {
    public void setZeroesBrute(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    // current Row=i;
                    // current Column=j;
                    for (int x = 0; x < c; x++) {
                        if (matrix[i][x] != 0) {
                            matrix[i][x] = -1;
                        }
                    }
                    for (int y = 0; y < r; y++) {
                        if (matrix[y][j] != 0) {
                            matrix[y][j] = -1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == -1)
                    matrix[i][j] = 0;
            }
        }
    }
    // Better: Since optimal solution is a derivative of better solution, with
    // O(n+m) SC, we don't need code. If still needed, watch the video.

    // Optimal Solution
    public void setZeroesOptimal(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean col0 = false;// flag for first column, false means there is no 0 in column 0 in input matrix.
                             // This,i.e. column 0 is treated differently. Think, and watch Striver's video
                             // for reasons
        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0)
                col0 = true;

            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        // reverse loop to fill the cell values to zero based on if it's row/column is
        // suppposed to be 0. Why reverse? Think, and watch the video for reasons

        for (int i = r - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
            if (col0)
                matrix[i][0] = 0;
        }
    }

}
