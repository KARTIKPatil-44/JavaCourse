package Assignments;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        float length = sc.nextFloat();

        System.out.println("Enter the Breadth: ");
        float breadth = sc.nextFloat();

        float area = length * breadth;
        System.out.println("The area of square is: " + area);

        sc.close();
    }

}
