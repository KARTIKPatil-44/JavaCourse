package Assignments;

import java.util.Scanner;

     public class AvgOfNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        float num1 = sc.nextFloat();

        System.out.println("Enter the num2: ");
        float num2 = sc.nextFloat();

        System.out.println("Enter the num3");
        float num3 = sc.nextFloat();
        
        float avg = (num1 + num2 + num3) /3;
        System.out.println("The avag of 3 number:" + avg);

        sc.close();
    }
    
}
