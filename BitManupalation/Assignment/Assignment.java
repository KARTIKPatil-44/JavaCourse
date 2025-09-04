package Assignment;

public class Assignment {
    public static void main(String[] args) {

        // swap number without using third varible
        // int a = 5, b = 6;
        // System.out.println("Befor swaping a: " + a + " Befor swaping b: " + b);
        // a = a ^ b;
        // b = b ^ a;
        // a = a ^ b;
        // System.out.println("After swaping a: " + a + " After swaping b: " + b);

        // Convert uppercase characters to lowercase using bits.
        for(char ch = 'A'; ch <='Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
    }

}
