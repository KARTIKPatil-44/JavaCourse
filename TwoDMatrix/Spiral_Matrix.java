package TwoDMatrix;

public class Spiral_Matrix {

    // Method to print the elements of a 2D matrix in spiral order
    public static void printSpiral(int matrix[][]) {
        // Starting row and column indexes
        int StRow = 0;
        int StCol = 0;
        // Ending row and column indexes
        int EndRow = matrix.length - 1;       // total rows - 1
        int EndCol = matrix[0].length - 1;    // total columns - 1

        // Loop until the start row/col crosses the end row/col
        while (StRow <= EndRow && StCol <= EndCol) {

            // ---- TOP: Print the top row from left to right ----
            for (int j = StCol; j <= EndCol; j++) {
                System.out.print(matrix[StRow][j] + " ");
            }

            // ---- RIGHT: Print the right column from top to bottom ----
            for (int i = StRow + 1; i <= EndRow; i++) {
                System.out.print(matrix[i][EndCol] + " ");
            }

            // ---- BOTTOM: Print the bottom row from right to left ----
            // (only if top row and bottom row are not the same)
            for (int j = EndCol - 1; j >= StCol; j--) {
                if (StRow == EndRow) { // avoid duplicate row printing
                    break;
                }
                System.out.print(matrix[EndRow][j] + " ");
            }

            // ---- LEFT: Print the left column from bottom to top ----
            // (only if start col and end col are not the same)
            for (int i = EndRow - 1; i >= StRow + 1; i--) {
                if (StCol == EndCol) { // avoid duplicate column printing
                    break;
                }
                System.out.print(matrix[i][StCol] + " ");
            }

            // Move to the next inner layer (shrink the boundaries)
            StCol++;
            StRow++;
            EndCol--;
            EndRow--;
        }
    }

    public static void main(String[] args) {
        // Example 4x4 matrix
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // Call the function to print matrix in spiral order
        printSpiral(matrix);
    }
}
