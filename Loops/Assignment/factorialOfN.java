package Loops.Assignment;

import java.util.Scanner;

public class factorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        int fact = 1;

        System.out.println("Enter any positive number: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++){
            fact *=i;
        }
        System.out.println("Factorial: "+fact);
        sc.close();

    }
    
}
