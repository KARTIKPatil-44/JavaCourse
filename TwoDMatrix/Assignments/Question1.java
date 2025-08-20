package TwoDMatrix.Assignments;
// Print the number of 7’s that are inthe 2d array
public class Question1 {


    public static int  countNum(int matrix[][], int n , int m){
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int matrix [][] ={{4,7,8},
                          {8,8,7}};
        int n = matrix.length;
        int m = matrix[0].length;
    System.out.println(countNum(matrix,n,m));
    }
    
}
