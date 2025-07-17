package Operators;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the val of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the val of b: ");
        int b = sc.nextInt();
        System.out.println("add: " + (a + b));
        System.out.println("sub: " + (a - b));
        System.out.println("prod: " + (a * b));
        System.out.println("div: " + (a / b));
        System.out.println("modulo: " + (a % b));

        sc.close();
    }
    
}
