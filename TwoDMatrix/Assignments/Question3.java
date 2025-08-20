package TwoDMatrix.Assignments;
// Write a program to FindTransposeofa Matrix.
public class Question3 {

    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j= 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    



    public static void main(String[] args) {
        int rows = 2, col = 3;
        int matrix[][] = { { 2, 3, 7 },
                           { 5, 6, 7 } };
       System.out.println("Orignal Matrix: "); 
       printMatrix(matrix);

        int transposeMatrix[][] = new int[col][rows];
        for(int i=0; i<rows; i++){
            for(int j = 0; j<col; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose Matrix: "); 
        printMatrix(transposeMatrix);

    }

}
