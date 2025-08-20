package TwoDMatrix;

public class Search_in_sorted_array {

    // Function to search for a key in a 2D matrix
    public static boolean Search_in_sorted_array(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("found at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        // Example 4x4 matrix
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // Searching for 11
        System.out.println(Search_in_sorted_array(matrix, 11)); // true
        // Searching for 20
        // System.out.println(Search_in_sorted_array(matrix, 20)); // false
    }
}
