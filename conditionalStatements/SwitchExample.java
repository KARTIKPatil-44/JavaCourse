package conditionalStatements;

import java.util.Scanner;

public class SwitchExample {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice form 1 to 3 and default choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("biryani");
                break;
            case 3:
                System.out.println("Pizza");
                break;

            default:
                System.out.println("wake up ur dreaming");

        }
        sc.close();
    }
    
}
