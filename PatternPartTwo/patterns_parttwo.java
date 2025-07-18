package PatternPartTwo;

public class patterns_parttwo {
    // HOLLOW RECTANGLE
    public static void hollow_Rectangel(int toRows, int toCols) {
        for (int i = 1; i <= toRows; i++) {
            for (int j = 1; j <= toCols; j++) {

                if (i == 1 || i == toRows || j == 1 || j == toCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(); // this line is for spcing in the output window

    }

    // INVERTED ROTATED HLAF PYRAMID
    public static void inverted_rotated_half_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); // this line is for spcing in the output window

    }

    // INVERTED HLAF PYRAMID WITH NUMBERS
    public static void inverted_half_pyramid_with_numbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(); // this line is for spcing in the output window

    }

    // FLOYD'S TRIANGLE
    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + counter);
                counter++;
            }
            System.out.println();
        }
        System.out.println(); // this line is for spcing in the output window

    }

    // 0-1 Triangle
    public static void zero_one_Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println(); // this line is for spcing in the output window

    }

    // Butterfly
    public static void Butterfly(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2d half
          for (int i = n; i>= 1; i--) {
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space - 2*(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); // this line is for spcing in the output window

    }

    // Solid Rombus
    public static void Solid_Rombus( int n){
        for(int i=1; i<=n; i++){
            // spaces
            for( int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); // this line is for spcing in the output window
    }
     // Hollow Rombus
    public static void hollow_Rombus( int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1||i==n || j==1|| j==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(); // this line is for spcing in the output window
    }

    // Diamond 
    public static void Diamond(int n){
        for(int i=1; i<=n; i++){
            for( int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i=n; i>=1; i--){
            for( int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        hollow_Rectangel(10, 10);
        inverted_rotated_half_Pyramid(4);
        inverted_half_pyramid_with_numbers(5);
        floyds_triangle(5);
        zero_one_Triangle(5);
        Butterfly(5);
        Solid_Rombus(5);
        hollow_Rombus(5);
        Diamond(5);

    }

}
