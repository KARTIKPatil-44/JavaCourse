import java.util.Scanner;

public class CreationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Phy: " + marks[0]);
        System.out.println("chem: " + marks[1]);
        System.out.println("math: " + marks[2]);
        System.out.println("Percentage: " + percentage);
        System.out.println("Length of array: " + marks.length);

        sc.close();
    }
}