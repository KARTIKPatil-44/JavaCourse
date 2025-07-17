package Assignments;

import java.util.Scanner;

public class bill {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of the Pencil: ");
        float Pencil = sc.nextFloat();

        System.out.println("Enter the cost of Pen: ");
        float Pen = sc.nextFloat();

        System.out.println("Enter the cost of Eraser: ");
        float Eraser = sc.nextFloat();

        float total = Pencil+Pen+Eraser;

        float gst = total * 0.18f;

        float finalBill = total + gst;

        System.out.println("Subtotal(Before GST):  "+total);
        System.out.println("GST @18%: "+gst);
        System.out.println("Total Bill (with GST): "+finalBill);
        int $= 24;
        System.out.println($);

        sc.close();
    }
    
}
