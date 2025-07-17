package conditionalStatements;

import java.util.Scanner;

public class largestOfthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num a: ");
        int a = sc.nextInt();
         System.out.println("enter num b: ");
        int b = sc.nextInt();
         System.out.println("enter num c: ");
        int c = sc.nextInt();

        if ((a >= b) && (a >= c)) {
            System.out.println("A is greater number");
        } else if ((b >= c)) {
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }
        sc.close();
    }

    
}
