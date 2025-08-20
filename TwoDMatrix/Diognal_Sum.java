package TwoDMatrix;

public class Diognal_Sum {

    // Function to calculate the sum of both diagonals of a square matrix
    public static int Diognal_Sum(int matrix[][]) {

        // Time Complexity (Optimized) = O(n) 
        // because we only loop once through the matrix length
        int sum = 0;

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Add primary diagonal element (top-left to bottom-right)
            sum += matrix[i][i];

            // Add secondary diagonal element (top-right to bottom-left)
            // Condition to avoid double counting the middle element 
            // when matrix size is odd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum; // return the total sum of both diagonals
    }

    public static void main(String[] args) {
        // Example 4x4 square matrix
        int matrix[][] = {
                { 1,  2,  3,  4 },
                { 5,  6,  7,  8 },
                { 9, 10, 11, 12 },
                { 13,14, 15, 16 } 
        };

        // Print diagonal sum
        System.out.println(Diognal_Sum(matrix));  
        // For this matrix:
        // Primary diagonal = 1 + 6 + 11 + 16 = 34
        // Secondary diagonal = 4 + 7 + 10 + 13 = 34
        // Total = 68
    }
}
