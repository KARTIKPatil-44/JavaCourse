// Check a number is even or add 
public class Even_odd {
    public static void EvenOdd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            // even
            System.out.println(n + " is even number");
        } else {
            // odd
            System.out.println(n + " is Odd number");
        }
    }

    public static void main(String[] args) {
        EvenOdd(3);
        EvenOdd(6);

    }

}
